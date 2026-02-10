public class Arbol implements Picable {

    int madera;
    int vida;

    public Arbol(int madera, int vida){
        this.madera = madera;
        this.vida = vida;

    }

@Override
public void esPicado(Personaje p){

    if (vida > 0 ){
    p.recogerMaterial(madera);
    vida = vida - 1;
    }else{
        System.out.println("No me queda vida! Arbol no devuelve material");
    }
}





}
