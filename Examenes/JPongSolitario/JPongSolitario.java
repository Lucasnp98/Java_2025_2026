import javax.swing.*;

public class JPongSolitario extends JFrame {
  public static void main(String[] args) {
    new JPongSolitario();
  }

  public JPongSolitario() {
    super("JPongSolitario");
    init();
  }

  private void init() {
    GamePanel gamePanel = new GamePanel();
    this.add(gamePanel);
    this.pack();
    gamePanel.requestFocus();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setVisible(true);


    
    new Thread(gamePanel).start();  // crea el hilo pasando el panel y lo arranca
  }
}