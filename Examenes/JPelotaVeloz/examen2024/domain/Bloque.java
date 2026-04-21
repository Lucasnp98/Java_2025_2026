package examen.domain;

import examen.ui.JFondo;
import examen.ui.JPelotaVeloz;

import java.awt.*;
import java.util.Random;

public class Bloque extends Sprite {

    public static final int WIDTH = 60;
    public static final int HEIGHT = 30;
    public static final int VELOCIDAD = 40;

    private boolean vertical;

    public Bloque() {
        Random r = new Random();
        this.vertical = r.nextBoolean();
        this.x = r.nextInt(JPelotaVeloz.GAME_WIDTH - WIDTH);
        this.y = r.nextInt(JPelotaVeloz.GAME_HEIGHT - HEIGHT);
        if (vertical) {
            this.velocidadX = 0;
            this.velocidadY = VELOCIDAD;
        } else {
            this.velocidadX = VELOCIDAD;
            this.velocidadY = 0;
        }
    }

    @Override
    public void pintar(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        if (vertical) {
            g.fillRect((int) x, (int) y, HEIGHT, WIDTH);
        } else {
            g.fillRect((int) x, (int) y, WIDTH, HEIGHT);
        }
    }

    @Override
    public Rectangle getShape() {
        if (vertical) {
            return new Rectangle((int) x, (int) y, HEIGHT, WIDTH);
        } else {
            return new Rectangle((int) x, (int) y, WIDTH, HEIGHT);
        }
    }

    @Override
    public void updatePosicion() {
        x += velocidadX / JFondo.FPS;
        y += velocidadY / JFondo.FPS;

        // Rebote en los bordes invirtiendo el sentido
        if (vertical) {
            if (y <= 0 || y + WIDTH >= JPelotaVeloz.GAME_HEIGHT) {
                velocidadY = -velocidadY;
            }
        } else {
            if (x <= 0 || x + WIDTH >= JPelotaVeloz.GAME_WIDTH) {
                velocidadX = -velocidadX;
            }
        }
    }

    @Override
    public void reset() {
        // Los bloques no se resetean, siguen su trayectoria
    }
}
