import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
  Slider slider;
  Pelota pelota;
  ScoreManager scoreManager;
  HashSet<Integer> teclasPulsadas;
  public static final int FPS = 30;

  private boolean gameOver;
  private long startTime;
  private long lastSpeedIncrement;
  private int elapsedSeconds;

  public GamePanel(){
    super();
    this.teclasPulsadas = new HashSet<>();
    this.scoreManager = new ScoreManager();
    this.slider = new Slider();
    this.pelota = new Pelota();

    HashMap<String, String> propertiesPantalla = PropertiesLoader.loadProperties("properties.txt", "Pantalla");
    this.setPreferredSize(new Dimension(Integer.parseInt(propertiesPantalla.get("WIDTH")),
                 Integer.parseInt(propertiesPantalla.get("HEIGHT"))));
    this.setBackground(Color.BLACK);

    initGame();

    this.addKeyListener(new KeyAdapter() {
      @Override
      public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT){
          teclasPulsadas.add(e.getKeyCode());
        }
        if(e.getKeyCode() == KeyEvent.VK_SPACE && gameOver){
          reiniciarPartida();
        }
      }
      @Override
      public void keyReleased(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT){
          teclasPulsadas.remove(e.getKeyCode());
        }
      }
    });

  }

  @Override
  public void run() {
    while(true){
      if(!gameOver) {
        long now = System.currentTimeMillis();
        elapsedSeconds = (int)((now - startTime) / 1000);

        if(now - lastSpeedIncrement >= 3000) {
          pelota.incrementarVelocidad();
          slider.incrementarVelocidad(pelota.getDv());
          lastSpeedIncrement = now;
        }

        pelota.mover();
        slider.mover(teclasPulsadas);

        pelota.colisionaConSlider(slider);

        if(pelota.tocaSuelo()) {
          gameOver = true;
          scoreManager.addScore(elapsedSeconds);
        }
      }

      this.repaint();

      try{
        Thread.sleep(1000 / FPS);
      }catch(InterruptedException e){
      }
    }
  }

  private void initGame() {
    gameOver = false;
    startTime = System.currentTimeMillis();
    lastSpeedIncrement = startTime;
    elapsedSeconds = 0;
  }

  private void reiniciarPartida() {
    pelota.reset();
    slider.reset();
    teclasPulsadas.clear();
    initGame();
  }

  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);




   
    slider.paint(g);
    pelota.paint(g);

    g.setColor(Color.RED);
    g.setFont(new Font("Arial", Font.BOLD, 14));
    g.drawString("Tiempo: " + elapsedSeconds + " segundos", 10, 20);

    g.setColor(Color.RED);
    g.setFont(new Font("Arial", Font.BOLD, 14));
    String tituloTop = "Top 3 Puntuaciones:";
    int anchoTitulo = g.getFontMetrics().stringWidth(tituloTop);
    g.drawString(tituloTop, getWidth() - anchoTitulo - 10, 20);

    String topText = scoreManager.getTopScoresText();
    if(!topText.isEmpty()) {
      String[] lineas = topText.split("\n");
      int yTexto = 38;
      for(String linea : lineas) {
        int anchoLinea = g.getFontMetrics().stringWidth(linea);
        g.drawString(linea, getWidth() - anchoLinea - 10, yTexto);
        yTexto += 18;
      }
    }

    if(gameOver) {
      g.setColor(Color.RED);
      g.setFont(new Font("Arial", Font.BOLD, 30));
      String msg = "¡Juego terminado!";
      int msgWidth = g.getFontMetrics().stringWidth(msg);
      g.drawString(msg, (getWidth() - msgWidth) / 2, getHeight() / 2 - 30);

      g.setFont(new Font("Arial", Font.BOLD, 18));
      String tiempo = "Tiempo final: " + elapsedSeconds + " segundos";
      int tWidth = g.getFontMetrics().stringWidth(tiempo);
      g.drawString(tiempo, (getWidth() - tWidth) / 2, getHeight() / 2 + 5);

      g.setColor(Color.GRAY);
      g.setFont(new Font("Arial", Font.PLAIN, 14));
      String restart = "Presiona ESPACIO para reiniciar";
      int rWidth = g.getFontMetrics().stringWidth(restart);
      g.drawString(restart, (getWidth() - rWidth) / 2, getHeight() / 2 + 35);
    }
  }
}