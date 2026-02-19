public class TarjetaDebito extends Tarjeta {

    double saldo;

    public TarjetaDebito(String numeracion, double saldo){
        super(numeracion);
        this.saldo = saldo;

    }



    @Override
    public void pagar(double cantidad){
        if (saldo > cantidad){
            saldo -= cantidad;
        }else{
            System.out.println("No hay suficiente saldo");
        }
    }

    public void ingresar(double cantidad){
        saldo = saldo + cantidad;
    }


    @Override
    public double calculaSaldo(){
        return saldo;
    }

}
