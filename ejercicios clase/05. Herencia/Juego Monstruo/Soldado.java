public class Soldado extends Personaje {

    Arma arma;
    



    public Soldado(int vida, String nombre, Arma arma){

        super(vida, nombre);
        this.arma = arma;

    }



    @Override 
    public void atacar(Personaje p){

        arma.disparar(p);

    }


    @Override
    public String toString(){


        return super.toString() + arma.toString();
    }

    public Arma getArma() {
        return arma;
    }



    public void setArma(Arma arma) {
        this.arma = arma;
    }




}
