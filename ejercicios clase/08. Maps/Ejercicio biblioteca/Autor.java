import java.util.*;
public class Autor{



    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Autor(int edad, String nombre){


        this.edad = edad;
        this.nombre = nombre;

    }

    @Override
    public String toString(){


        return "Nombre: " + nombre + " Edad: " + edad;
    }




    @Override

    public boolean equals(Object o){
        if(o instanceof Autor){

            Autor p = (Autor) o;
            if (p.getEdad() == edad && p.getNombre().equals(nombre)){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }




    

    @Override
    public int hashCode(){
        return Objects.hash(edad, nombre);
    }

    






}