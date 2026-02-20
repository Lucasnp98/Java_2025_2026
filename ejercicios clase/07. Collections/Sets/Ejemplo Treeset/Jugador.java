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
    public String toString(){
        return "Nombre: " + nombre + " Goles: " + goles + " Edad: " + edad;
    }

   

   @Override
public int compareTo(Jugador j){

    int res = Integer.compare(j.getEdad(), edad);

    if(res != 0) return res;

    res = Integer.compare(j.getGoles(),goles);

    if(res != 0) return res;


    return nombre.compareTo(j.getNombre());
}

    
    
    
    }







