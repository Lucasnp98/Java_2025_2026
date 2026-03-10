
import java.util.* ;

public class App {


    public static void main (String argv[]){

        //HashMap<Persona,Coche> mapa_persona_coche = new HashMap<>();



        TreeMap<Persona,Coche> mapa_persona_coche = new TreeMap<>();
        Persona p1 = new Persona("123X", 20, "Lucas");
        Persona p2 = new Persona("123H", 25, "Manolo");

        Coche c1 = new Coche("1234JHK", "GOLF");
        Coche c2 = new Coche("1897KHY", "Audi");

        mapa_persona_coche.put(p1, c1);
        mapa_persona_coche.put(p2, c2);



        // Persona p3 = new Persona("123X", 20, "Lucas");

        // System.out.println(mapa_persona_coche.containsKey(p3));
        // System.out.println(mapa_persona_coche.get(p3));









        for (Persona p: mapa_persona_coche.keySet()){
            System.out.println(p);
            Coche c = mapa_persona_coche.get(p);
            System.out.println(c);
            System.out.println("---------------------");
        }



        // for (Coche c:mapa_persona_coche.values()){
        //     System.out.println(c);
        // }














        
    }
    
}
