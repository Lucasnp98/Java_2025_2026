import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PanelJuego extends JPanel{

 

    
   Pelota pelota;
   Pelota pelota2;

   
  

    public PanelJuego()
    {
        this.setBackground(Color.WHITE);

        
        this.pelota = new Pelota(200,300,30);
        this.pelota2  = new Pelota(400,500,60);
        


    }




   

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        pelota.pintar(g);  
        pelota2.pintar(g);   

    }


    

    
}