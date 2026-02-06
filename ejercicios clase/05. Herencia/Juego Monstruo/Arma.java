public class Arma {

    int municion;
    int danio; 
    static int CARGADOR = 10;

    public Arma(int municion, int danio){

        this.municion = municion; 
        this.danio = danio;
    }



    public void restar_municion(){
        municion = municion - 1;
    }



    public void recargar(){
        municion = municion + CARGADOR;
    }
    public void disparar(Personaje p){

        if (municion > 0){
        p.recibirDanio(danio);
        restar_municion();
        }else{
            System.out.println("No tienes balas!!!!!");
        }
        

    }


    @Override
    public String toString(){

        return " Daño: " + danio + " Municion: " +municion;
    }

}
