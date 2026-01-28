public class App{
    public static void main(String args[]){

    Taller taller = new Taller(3);
    Coche c1 = new Coche("1234", "GOLF", 100000);
    taller.addCoche(c1);

    Coche c2 = new Coche("12345", "SEAT", 10000);
    taller.addCoche(c2);
    taller.mostrarCoches();

    System.out.println(taller.calcular_maximo());
   

    }
}