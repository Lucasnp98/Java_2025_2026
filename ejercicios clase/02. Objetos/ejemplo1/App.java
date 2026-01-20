public class App {

    public static void main(String argv[])
    {

        Jugador j1 = new Jugador();
        j1.equipo = "Barsa";
        j1.goles = 10;
        j1.nombre = "Lamine";
        j1.posicion = "ED";

        
        Jugador j2 = new Jugador(); 
        j2.equipo = "RM";
        j2.goles = 50;
        j2.nombre = "Zinedine Zidane";
        j2.posicion = "MCO";

        j1.mostrar_info();
        j2.mostrar_info();


        j2.marcar_gol();

        System.out.println("------------------------------------");


        j1.mostrar_info();
        j2.mostrar_info();



    

        




    }
}
