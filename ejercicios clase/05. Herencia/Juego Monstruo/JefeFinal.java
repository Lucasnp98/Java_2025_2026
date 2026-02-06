public class JefeFinal extends Monstruo {

    static int UMBRAL_FURIA = 50;
    static int VIDA_RECUPERADA = 20;




    public JefeFinal(int vida, String nombre, int fuerza){

        super(vida, nombre, fuerza);
    }

    public boolean isfurioso(){
        return vida < UMBRAL_FURIA;
    }


    public void recuperarse(){

        vida = vida + VIDA_RECUPERADA;
    }
    @Override
    public void atacar(Personaje p){

        super.atacar(p);
        if (isfurioso()){
            System.out.println("ESTOY FURIOSO!!!");
            super.atacar(p);
            recuperarse();
        }


    }

    @Override
    public String toString(){

        return super.toString() + " Furioso: " + isfurioso();



    }





}
