import java.awt.*;
import javax.swing.*;

public class JVentana extends JFrame {

    private static final int ANCHO = 500;
    private static final int ALTO = 600;
    private static final int TAMANIO_FUENTE = 20;
    private static final Font FUENTE = new Font("Consolas", Font.BOLD, TAMANIO_FUENTE);
    private JPanel panel;

    public JVentana() {
        setTitle("Primera GUI");
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        initComponents();
        
    }

    public void aplicarFuente(){
         for (Component c:panel.getComponents()){
            c.setFont(FUENTE);
        }

    }
   

    public void initComponents(){
        panel = new JPanel();
        panel.setBackground(new Color(180, 203, 212));
        JButton boton = new JButton("Hola esto es un boton");
        panel.add(boton);
        JButton boton2 = new JButton("Hola esto es otro botón");
        panel.add(boton2);
        JLabel etiqueta = new JLabel("Hola esto es una etiqueta");
        panel.add(etiqueta);
        JTextArea area_texto = new JTextArea("Hola esto es un area  de texto");
        JRadioButton radio_boton = new JRadioButton("Esto es un radioBoton");
        JRadioButton radio_boton2 = new JRadioButton("Esto es un otro radioboton");

        ButtonGroup grupoBotones = new ButtonGroup();

        grupoBotones.add(radio_boton);
        grupoBotones.add(radio_boton2);

        panel.add(radio_boton);
        panel.add(radio_boton);
        panel.add(area_texto);
        aplicarFuente();
        add(panel);

    }

    public static void main(String[] args) {
        //new JVentana();
        SwingUtilities.invokeLater(() -> new JVentana());
    }
}