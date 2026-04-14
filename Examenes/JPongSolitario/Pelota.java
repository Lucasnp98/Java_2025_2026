import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.HashMap;

public class Pelota extends Sprite {

  int dv;
  int size;

  public Pelota(){
    HashMap<String, String> propertiesPelota = PropertiesLoader.loadProperties("properties.txt", "Pelota");
    this.x = Integer.parseInt(propertiesPelota.get("X_INICIAL"));
    this.y = Integer.parseInt(propertiesPelota.get("Y_INICIAL"));
    this.vx = Integer.parseInt(propertiesPelota.get("VELOCIDAD_INICIAL_X"));
    this.vy = Integer.parseInt(propertiesPelota.get("VELOCIDAD_INICIAL_Y"));
    this.dv = Integer.parseInt(propertiesPelota.get("INCREMENTO_VELOCIDAD"));
    this.size = Integer.parseInt(propertiesPelota.get("SIZE"));
  }

  public int getDv() { return dv; }
  public int getSize() { return size; }

  @Override
  public Rectangle getRect() {
    return new Rectangle(x, y, size, size);
  }

  @Override
  void paint(Graphics g) {
    g.setColor(Color.RED);
    g.fillOval(x, y, size, size);
  }

  void mover() {
    HashMap<String, String> propertiesPantalla = PropertiesLoader.loadProperties("properties.txt", "Pantalla");
    int tamPX = Integer.parseInt(propertiesPantalla.get("WIDTH"));

    x += vx / GamePanel.FPS;
    y += vy / GamePanel.FPS;

    if (x + size > tamPX || x < 0) {
      vx = -vx;
    }
    if (y < 0) {
      vy = Math.abs(vy);
    }
  }

  boolean tocaSuelo() {
    HashMap<String, String> propertiesPantalla = PropertiesLoader.loadProperties("properties.txt", "Pantalla");
    int tamPY = Integer.parseInt(propertiesPantalla.get("HEIGHT"));
    return y + size >= tamPY;
  }

  boolean colisionaConSlider(Slider slider) {
    if (this.getRect().intersects(slider.getRect())) {
      int centroPelota = x + size / 2;
      int centroSlider = slider.getX() + slider.getWidth() / 2;

      vy = -Math.abs(vy);

      if (centroPelota < centroSlider) {
        vx = -Math.abs(vx);
      } else {
        vx = Math.abs(vx);
      }
      return true;
    }
    return false;
  }

  void incrementarVelocidad() {
    if (vx > 0) vx += dv;
    else vx -= dv;

    if (vy > 0) vy += dv;
    else vy -= dv;
  }

  void reset() {
    HashMap<String, String> propertiesPelota = PropertiesLoader.loadProperties("properties.txt", "Pelota");
    this.x = Integer.parseInt(propertiesPelota.get("X_INICIAL"));
    this.y = Integer.parseInt(propertiesPelota.get("Y_INICIAL"));
    this.vx = Integer.parseInt(propertiesPelota.get("VELOCIDAD_INICIAL_X"));
    this.vy = Integer.parseInt(propertiesPelota.get("VELOCIDAD_INICIAL_Y"));
  }

  @Override
  public String toString() {
    return "Pelota [x=" + x + ", y=" + y + ", vx=" + vx + ", vy=" + vy + ", dv=" + dv + ", size=" + size + "]";
  }
}