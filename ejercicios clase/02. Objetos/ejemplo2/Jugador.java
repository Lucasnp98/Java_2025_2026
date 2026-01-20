public class Jugador {
    

    String equipo;
    int goles;
    String posicion;
    String nombre;




  

    public Jugador(String equipo, int goles, String posicion, String nombre){
        this.equipo = equipo;
        this.goles = goles;
        this.posicion = posicion;
        this.nombre = nombre;

    }



    public void setNombre(String nombre){

        this.nombre = nombre;

    }


    public void setEquipo(String equipo){

        this.equipo = equipo;
    }


    public void setGoles(int goles){
        this.goles = goles;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }


    public String getEquipo(){
        return this.equipo;
    }


    public String getNombre(){
        return this.nombre;
    }



    public int getGoles(){
        return this.goles;
    }


    public String getPosicion(){


        return this.posicion;
    }

    public void mostrar_info(){

    System.out.println("El jugador " + nombre + " Juega en: " + equipo + " Y juega de: " + posicion + " ha metido: " + goles);


}
}
