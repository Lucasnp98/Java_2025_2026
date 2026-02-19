public abstract class Tarjeta {

    String numeracion;
    
    Tarjeta(String numeracion){
        this.numeracion = numeracion;
        
    }
    public abstract void pagar(double cantidad);

    public abstract double calculaSaldo();




}
