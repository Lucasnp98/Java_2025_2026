import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Sprite {
  int x;
  int y;
  int vx;
  int vy;

  public int getX() { return x; }
  public int getY() { return y; }
  public int getVx() { return vx; }
  public int getVy() { return vy; }

  public abstract Rectangle getRect();

  abstract void paint(Graphics g);
}