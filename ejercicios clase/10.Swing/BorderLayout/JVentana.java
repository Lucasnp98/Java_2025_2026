import java.awt.*;
import javax.swing.*;

public class JVentana extends JFrame {

    private static final int ANCHO = 500;
    private static final int ALTO = 600;
    // private static final int TAMANIO_FUENTE = 20;
    // private static final Font FUENTE = new Font("Consolas", Font.BOLD, TAMANIO_FUENTE);
    // private JPanel panel;





    // QUIERO QUE ME TRAIGÁIS HECHA UNA CALCULADORA. DEBE TENER UN PANEL NORTE, UN PANEL SUR Y UN PANEL CENTRO
    // SOBRE EL PANEL DEL CENTRO DEBES DISPONER LOS BOTONES SIGUIENGO UN GRIDLAYOUT
    // SOBRE EL PANEL NORTE DEBE APARECER UN JTEXTAREA DONDE EN UN FUTURO SE VOLCARÁ LA OPERACION
    // SOBRE EL PANEL  SUR DEBE APARECER UNA ETIQUETA QUE PONGA "CALCULADORA DE 2ºA"
    // DEBES AÑADIR LA FUENTE  COMIC SANS NEGRITA A TODOS LOS COMPONENTES

    public JVentana() {
        setTitle("Primera GUI");
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        setLayout(new BorderLayout());
        iniciarComponentes();
       
        
    }



    public JPanel crearPanel(Color color, Dimension d){

        JPanel panel = new JPanel();
        panel.setBackground(color);

        if (d != null){
        panel.setPreferredSize(d);
        }

        return panel;




    }
    






    public void iniciarComponentes(){

        configurarPaneles();

        
    }

    public void configurarPaneles(){

        JPanel panelCentro = crearPanel(Color.RED, null);

        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        panelCentro.add(boton1);
        panelCentro.add(boton2);



        JPanel panelNorte = crearPanel(Color.BLUE,new Dimension(0, 80));
        JPanel panelSur = crearPanel(Color.YELLOW,new Dimension(0, 80));
        JPanel panelEste = crearPanel(Color.LIGHT_GRAY,new Dimension(80, 0));
        JPanel panelOeste = crearPanel(Color.MAGENTA,new Dimension(80, 0));
        
       
        add(panelCentro, BorderLayout.CENTER);
        add(panelNorte, BorderLayout.NORTH);
        add(panelSur, BorderLayout.SOUTH);
        add(panelEste, BorderLayout.EAST);
        add(panelOeste, BorderLayout.WEST);

    }
   

   
    public static void main(String[] args) {
        //new JVentana();
        SwingUtilities.invokeLater(() -> new JVentana());
    }
}