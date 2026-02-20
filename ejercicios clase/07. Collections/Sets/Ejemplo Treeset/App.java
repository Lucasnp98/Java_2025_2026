import java.util.*;

public class App {

    public static void main(String[] args) {
        Jugador j1 = new Jugador("Lucas",10, 20);
        Jugador j2 = new Jugador("Manolo", 10, 20);
        Jugador j3 = new Jugador("Lucas", 20, 20);

        TreeSet<Jugador> jugadores = new TreeSet<>();

        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);

        for (Jugador j:jugadores){
            System.out.println(j);
        }
    }
    
}
