public abstract class Figura {

    double x;
    double y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método común a TODAS las figuras
    public void mover(double dx, double dy) {
        x += dx;
        y += dy;
        System.out.println("Figura movida a (" + x + ", " + y + ")");
    }

    // Cada figura calcula su área de forma distinta
    public abstract double calcularArea();
}
