public class Jugador{

String equipo;
int goles;
String posicion;
String nombre; 







public void mostrar_info(){

    System.out.println("El jugador " + nombre + " Juega en: " + equipo + " Y juega de: " + posicion + " ha metido: " + goles);


}


public void marcar_gol(){
    goles = goles + 1;
}

    
}