public abstract class Personaje {

String nombre;
int vida;

Personaje(int vida, String nombre){

    this.vida = vida;
    this.nombre = nombre;
}


public abstract void atacar(Personaje p);

public void recibirDanio(int danio){

    vida = vida - danio;
}





public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public int getVida() {
    return vida;
}


public void setVida(int vida) {
    this.vida = vida;
}


@Override 
public String toString(){

    return "Nombre: " + nombre + " Vida: " + vida;
}



}
