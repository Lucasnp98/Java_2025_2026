package examen.ui;

import examen.domain.Juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;

public class JFondo extends JPanel implements Runnable {
    public static final int FPS = 30;
    HashSet<Integer> teclasPulsadas;
    Juego juego;

    public JFondo() {
        super();
        this.juego = new Juego();
        /** CODIGO A INTRODUCIR AQUÍ */
        this.setPreferredSize(new Dimension(JPelotaVeloz.GAME_WIDTH, JPelotaVeloz.GAME_HEIGHT));
        this.setFocusable(true);
        this.teclasPulsadas = new HashSet<>();

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                teclasPulsadas.add(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                teclasPulsadas.remove(e.getKeyCode());
            }
        });

        new Thread(this).start();
        /*****/
    }

    @Override
    public void run() {
        while (true) {
            juego.update(teclasPulsadas);
            repaint();
            try {
                Thread.sleep(1000 / FPS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        juego.paint(g);
    }
}
