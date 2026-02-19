import java.awt.Color;
import java.util.ArrayList;
public class App {

    public static void main (String argv[]){

        ArrayList<Cliente> clientes = generarClientes();


       
       


        for (Cliente c:clientes){

            System.out.println(c);
        }






        

        



    }

    public static ArrayList<Cliente> generarClientes(){

        Tarjeta tcredito1 = new TarjetaCredito("1234X", 1000);
        tcredito1.pagar(500);
        Tarjeta tcredito2 =  new TarjetaCredito("1234H", 200);
        tcredito2.pagar(100);
        Tarjeta tdebito1 = new TarjetaDebito("1234X", 1000);
        Tarjeta tdebito2 = new TarjetaDebito("1234X", 3000);
        ArrayList<Tarjeta> tarjetas1 = new ArrayList<>();
        tarjetas1.add(tcredito1);
        tarjetas1.add(tdebito1);

        ArrayList<Tarjeta> tarjetas2 = new ArrayList<>();
        tarjetas2.add(tcredito2);
        tarjetas2.add(tdebito2);

        Cliente c1 = new Cliente("Lucas", "1234K", tarjetas1);
        Cliente c2 = new Cliente("Dani", "1234J", tarjetas2);

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);


        return clientes;     

    }
    
}
