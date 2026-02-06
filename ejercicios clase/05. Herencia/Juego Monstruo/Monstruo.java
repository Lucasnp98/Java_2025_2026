public class Monstruo extends Personaje {

    int fuerza;

    public Monstruo(int vida, String nombre, int fuerza){
        super(vida, nombre);
        this.fuerza = fuerza;
    }

   
    @Override
    public void atacar(Personaje p){

        p.recibirDanio(fuerza);
    }


    @Override
    public String toString(){

        return super.toString() + " Fuerza: " + fuerza;

    }

}
