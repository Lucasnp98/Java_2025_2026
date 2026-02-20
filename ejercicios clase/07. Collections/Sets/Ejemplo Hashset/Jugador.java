
import java.util.Objects;

public class Jugador implements Comparable<Jugador> {


    String nombre;
    int goles;
    int edad;


     Jugador(String nombre, int goles, int edad){
        this.nombre = nombre;
        this.goles = goles;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public int hashCode(){
        return Objects.hash(goles, edad, nombre);
    }


    @Override
    public boolean equals(Object o){
        if (o instanceof Jugador){
            Jugador j = (Jugador)o;
            if (edad == j.getEdad() && goles == j.getGoles() && nombre.equals(j.getNombre())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " Goles: " + goles + " Edad: " + edad;
    }

   

   @Override
public int compareTo(Jugador j){

    // int res = Integer.compare(j.edad, this.edad);

    // if(res != 0) return res;

    // res = Integer.compare(j.goles, this.goles);

    // if(res != 0) return res;
    // return 0;

    return this.nombre.compareTo(j.nombre);
}

    
    
    
    }







