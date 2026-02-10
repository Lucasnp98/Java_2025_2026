public class Baya implements Picable{
    int curacion;

    public Baya(int curacion){
        this.curacion = curacion;
    }

    @Override
    public void esPicado(Personaje p){
        p.curar(curacion);
    }



}
