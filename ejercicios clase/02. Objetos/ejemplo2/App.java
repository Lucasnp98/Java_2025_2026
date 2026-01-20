public class App {


    public static void main(String args[]){

        Jugador j1 = new Jugador("RM", 50, "MCO", "Zidane");
        
        // j1.setNombre("Tirso");
        j1.setEquipo("Cádiz");
        // j1.setGoles(20);
        // j1.setPosicion("Portero");





        System.out.println("El equiop de j1 es: " + j1.getEquipo());
        System.out.println("EL nombre de j1 es: " + j1.getNombre());

        System.out.println("La posicion de j1 es: " + j1.getPosicion());
        System.out.println("Los goles de j1 es: " + j1.getGoles());

        //j1.mostrar_info();

       

        
    }
    
}
