public abstract class Personaje  implements Picable{

String nombre;
int vida;
int material;
Personaje(int vida, String nombre){

    this.vida = vida;
    this.nombre = nombre;
    this.material = 0;
}


public abstract void atacar(Personaje p);

public void recibirDanio(int danio){

    vida = vida - danio;
}


public void recogerMaterial(int cantidad){
    material = material + cantidad;

}




public String getNombre() {
    return nombre;
}

@Override
public void esPicado(Personaje p){
    vida = vida - 1;

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




public void curar(int curacion){
    vida = vida + curacion;
}
@Override 
public String toString(){

    return "Nombre: " + nombre + " Vida: " + vida + " Material: " + material;
}


public void picar(Picable p){
    p.esPicado(this);
}





}
