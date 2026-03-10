import java.util.*;
public class Persona implements Comparable<Persona>{


    private String dni;
    private int edad;
    private String nombre;




    Persona(String dni, int edad, String nombre){

        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
    }


    
    public String getDni() {
        return dni;
    }



    public void setDni(String dni) {
        this.dni = dni;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public int compareTo(Persona p){
        int compedad = Integer.compare(edad, p.getEdad());

        return -compedad;
    }


    @Override
    public int hashCode(){
        return Objects.hash(dni, edad);
    }



    @Override
    public boolean equals(Object o){

        if (o instanceof Persona){
            Persona p = (Persona)o;
            if (p.getDni().equals(dni) && p.getEdad() == edad){
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


        return "Nombre: " + nombre + " DNI: " + dni + " Edad: " + edad;

    }




    
}