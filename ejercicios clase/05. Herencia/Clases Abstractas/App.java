public class App {

    public static void main(String[] args) {

        Figura f1 = new Rectangulo(0, 0, 4, 3);
        Figura f2 = new Circulo(5, 5, 2);

        System.out.println("Área rectángulo: " + f1.calcularArea());
        System.out.println("Área círculo: " + f2.calcularArea());

        f1.mover(2, 1);
        f2.mover(-3, 0);
    }
}
