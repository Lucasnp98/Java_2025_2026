import java.util.*;

public class App {

    public static void main (String argv[]){


        Map <Autor, ArrayList<Libro>> autores = new HashMap<>();


        Autor zafon = new Autor(50, "Carlos Ruiz Zafón");
        Autor arturo = new Autor(60, "Arturo Perez Reverte");
        Autor victor = new Autor(60,"Victor Frankl");


        Libro l1 = new Libro("La sombra del viento", 2010);
        Libro l2 = new Libro("EL juego del Ángel", 2023);
        Libro l3 = new Libro("Territorio Comanche", 2020);
        Libro l4 = new Libro("El Hombre en busca de sentido", 2013);


       



        insertar_libro(autores, zafon , l1);

        insertar_libro(autores, arturo, l3);
        insertar_libro(autores, zafon, l2);




        for (Autor a:autores.keySet()){
            System.out.println(a);
            ArrayList<Libro> libros_autor = autores.get(a);
            for (Libro l:libros_autor){
                System.out.println(l);
            }

            System.out.println("--------------");
        }
    }



    public static void insertar_libro(Map <Autor, ArrayList<Libro>> autores,  Autor autor, Libro libro){

        if(autores.containsKey(autor)){
            autores.get(autor).add(libro);
        }else{
            ArrayList<Libro> libros_autor = new ArrayList<>();
            libros_autor.add(libro);
            autores.put(autor, libros_autor);
            
        }


        
    }
    
}
