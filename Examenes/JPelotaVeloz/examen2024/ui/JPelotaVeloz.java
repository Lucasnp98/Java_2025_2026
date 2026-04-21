package examen2024.ui;

import examen2024.ui.JFondo;

import javax.swing.*;


public class JPelotaVeloz extends JFrame {

    public static final int GAME_WIDTH = 880;
    public static final int GAME_HEIGHT = 550;

    JPelotaVeloz(){
        super("JPelota");

        JFondo fondo = new JFondo();
        this.add(fondo);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fondo.requestFocus();
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new JPelotaVeloz();
    }
}