import java.util.*;
public class App {

    public static void main(String[] args) {
        
    ArrayList<Cliente> clientes = new ArrayList<>();
    Cliente c1 = new Cliente("Lucas", "123H");
    Cliente c2 = new Cliente("Dani", "123K");
    Cliente c3 = new Cliente("Dani", "123K");

    clientes.add(c1);
    clientes.add(c2);
    // clientes.add(c3);

    System.out.println(clientes.contains(c3));
    // System.out.println(clientes.indexOf(c1));
    // System.out.println(clientes.remove(c1));
    // System.out.println(clientes);


        
    }






    
}
