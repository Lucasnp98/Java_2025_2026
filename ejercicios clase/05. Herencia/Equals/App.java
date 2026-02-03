

public class App {

    public static void main(String[] args) {

        // System.out.println("=== 1) TIPOS PRIMITIVOS: '==' compara VALOR ===");
        // int a = 5;
        // int b = 5;
        // int c = 6;

        // System.out.println("a == b -> " + (a == b)); // true
        // System.out.println("a == c -> " + (a == c)); // false

        String nombre1 = "Lucas";
        String nombre2 = "Lucas";
        // System.out.println(nombre1 == nombre2);
        // System.out.println(nombre1.equals(nombre2));


        Persona p1 = new Persona(20, "Lucas", "1237");
        Persona p2 = new Persona(20, "Manolo", "123");
       

        System.out.println(p1.equals(p2));

        System.out.println(p1);
        


       




       
       

       

       
    }
}
