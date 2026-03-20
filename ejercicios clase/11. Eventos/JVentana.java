import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class JVentana extends JFrame implements ActionListener{

    private static final int ANCHO = 500;
    private static final int ALTO = 600;
    private static final int TAMANIO_FUENTE = 20;
    private static final Font FUENTE = new Font("Consolas", Font.BOLD, TAMANIO_FUENTE);
    private JButton boton1;
    private JButton boton2;



    public JVentana() {
        setTitle("CALCULADORA");
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initComponents();

        setLocationRelativeTo(null);
        setVisible(true);
    }

  

    private void initComponents() {

        JPanel panel1 = new JPanel();

        boton1 = new JButton("Esto es un botón");
        boton1.addActionListener(this);

        boton2 = new JButton("Boton 2");
        boton2.addActionListener(this);

        panel1.add(boton1);
        panel1.add(boton2);

        this.add(panel1);

      

    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == boton1){
            System.out.println("Boton 1 pulsado");
            new JVentana();
        }else if(e.getSource() == boton2){
            System.out.println("Boton 2 pulsado");
        }

    


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JVentana());
    }
}