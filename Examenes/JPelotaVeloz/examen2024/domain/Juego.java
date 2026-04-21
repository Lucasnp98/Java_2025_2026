package examen2024.domain;

import examen2024.ui.JFondo;
import examen2024.ui.JPelotaVeloz;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Juego {

    public static final int NUM_BLOQUES = 5;
    public static final int FRAMES_RESET = 2 * JFondo.FPS; // 2 segundos

    private Pelota pelota;
    private List<Sprite> sprites;
    private TreeSet<Double> topPuntuaciones;
    private double velocidadMax;
    private boolean fin;
    private int contadorFin;

    public Juego() {
        this.pelota = new Pelota();
        this.sprites = new ArrayList<>();
        this.sprites.add(pelota);
        for (int i = 0; i < NUM_BLOQUES; i++) {
            sprites.add(new Bloque());
        }
        this.topPuntuaciones = new TreeSet<>(Comparator.reverseOrder());
        this.velocidadMax = 0;
        this.fin = false;
        this.contadorFin = 0;
    }

    public void update(HashSet<Integer> teclasPulsadas) {
        if (fin) {
            // Durante el "FIN" los bloques siguen moviéndose, la pelota no
            sprites.stream()
                    .filter(s -> s instanceof Bloque)
                    .forEach(Sprite::updatePosicion);
            contadorFin++;
            if (contadorFin >= FRAMES_RESET) {
                pelota.reset();
                velocidadMax = 0;
                fin = false;
                contadorFin = 0;
            }
            return;
        }

        // Aceleración de la pelota según teclas pulsadas
        teclasPulsadas.forEach(pelota::acelerar);

        // Actualización polimórfica de todos los sprites
        sprites.forEach(Sprite::updatePosicion);

        // Colisión pelota-bloques
        sprites.stream()
                .filter(s -> s instanceof Bloque)
                .filter(s -> s.getShape().intersects(pelota.getShape()))
                .forEach(s -> pelota.desacelerar());

        // Actualizar velocidad máxima
        if (pelota.getVelocidad() > velocidadMax) {
            velocidadMax = pelota.getVelocidad();
        }

        // Comprobar fin de intento
        if (pelota.fueraDePantalla()) {
            fin = true;
            actualizarTop(velocidadMax);
        }
    }

    private void actualizarTop(double puntuacion) {
        topPuntuaciones.add(puntuacion);
        while (topPuntuaciones.size() > 3) {
            topPuntuaciones.pollLast();
        }
    }

    public void paint(Graphics g) {
        // Pintado polimórfico de todos los sprites
        sprites.forEach(s -> s.pintar(g));

        // Texto velocidad (arriba izquierda)
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.drawString(String.format("Velocidad - actual: %.1f, max: %.1f",
                pelota.getVelocidad(), velocidadMax), 10, 20);

        // Top puntuaciones (arriba derecha)
        g.setColor(Color.BLUE);
        g.drawString("TOP PUNTUACIONES", JPelotaVeloz.GAME_WIDTH - 180, 20);
        int i = 1;
        int posY = 40;
        for (Double p : topPuntuaciones) {
            g.drawString(String.format("%d: %.1f", i, p),
                    JPelotaVeloz.GAME_WIDTH - 100, posY);
            posY += 15;
            i++;
        }

        // Mensaje FIN
        if (fin) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 60));
            g.drawString("FIN", JPelotaVeloz.GAME_WIDTH / 2 - 60,
                    JPelotaVeloz.GAME_HEIGHT / 2);
        }
    }
}
