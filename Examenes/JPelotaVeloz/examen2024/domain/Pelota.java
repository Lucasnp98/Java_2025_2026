package examen.domain;

import examen.ui.JFondo;
import examen.ui.JPelotaVeloz;

import java.awt.*;

public class Pelota extends Sprite {

    public static final int SIZE = 30;
    public static final int X_INICIAL = 50;
    public static final int Y_INICIAL = 450;
    public static final int ACELERACION_X = 20;
    public static final int ACELERACION_Y = 20;
    public static final int DESACELERACION = 40;

    public Pelota() {
        super(X_INICIAL, Y_INICIAL, 0, 0);
    }

    @Override
    public void pintar(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval((int) x, (int) y, SIZE, SIZE);
    }

    @Override
    public Rectangle getShape() {
        return new Rectangle((int) x, (int) y, SIZE, SIZE);
    }

    @Override
    public void updatePosicion() {
        x += velocidadX / JFondo.FPS;
        y += velocidadY / JFondo.FPS;
    }

    @Override
    public void reset() {
        this.x = X_INICIAL;
        this.y = Y_INICIAL;
        this.velocidadX = 0;
        this.velocidadY = 0;
    }

    // Acelera la pelota según las teclas pulsadas (se llama desde Juego)
    public void acelerar(int tecla) {
        double incremento = 1.0 / JFondo.FPS;
        switch (tecla) {
            case java.awt.event.KeyEvent.VK_LEFT  -> velocidadX -= ACELERACION_X * incremento;
            case java.awt.event.KeyEvent.VK_RIGHT -> velocidadX += ACELERACION_X * incremento;
            case java.awt.event.KeyEvent.VK_UP    -> velocidadY -= ACELERACION_Y * incremento;
            case java.awt.event.KeyEvent.VK_DOWN  -> velocidadY += ACELERACION_Y * incremento;
        }
    }

    // Desacelera la pelota al chocar con un bloque
    public void desacelerar() {
        double factor = DESACELERACION / JFondo.FPS;
        double v = getVelocidad();
        if (v <= factor) {
            velocidadX = 0;
            velocidadY = 0;
        } else {
            velocidadX -= (velocidadX / v) * factor;
            velocidadY -= (velocidadY / v) * factor;
        }
    }

    // Comprueba si la pelota ha salido de la pantalla
    public boolean fueraDePantalla() {
        return x + SIZE < 0 || x > JPelotaVeloz.GAME_WIDTH
                || y + SIZE < 0 || y > JPelotaVeloz.GAME_HEIGHT;
    }
}
