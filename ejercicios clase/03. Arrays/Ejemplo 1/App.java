public class App {


    public static void main(String args [])
    {

        Coche c1 = new Coche("1234K", "Seat", 180);
        Coche c2 = new Coche("1432R", "Ford", 300);
        Coche c3 = new Coche("2789I", "Peugeot", 200);

        Persona p1 = new Persona("Manolo", "1234J", 180,c1);
        Persona p2 = new Persona("Ana", "12324K", 170, c2);
        Persona p3 = new Persona("Florian", "1864K", 185, c3);
       

        Persona[] personas = new Persona[10];

        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;

        


        // for (int i = 0; i < personas.length; i++){

        //     if (personas[i] != null)
        //     {
        //         personas[i].imprimir_info();
        //     }


        // }


        for (Persona p:personas)
        {   if (p != null)
            {
                p.imprimir_info();
            }
        }
        
        





        
    }
    
}
