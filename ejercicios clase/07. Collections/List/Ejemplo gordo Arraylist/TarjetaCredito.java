public class TarjetaCredito extends Tarjeta {

    int limite;
    double deuda;


    public TarjetaCredito(String numeracion, int limite){
    super(numeracion);
    this.deuda = 0;
    this.limite = limite;
    }


    @Override
    public void pagar(double cantidad){
        if (deuda < limite) {
            deuda = deuda + cantidad;
        }
    }


    @Override
    public double calculaSaldo(){
        return -deuda;
    }
   




}
