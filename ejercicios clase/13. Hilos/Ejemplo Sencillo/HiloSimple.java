public class HiloSimple extends Thread

{
    int numero;
    public HiloSimple(int numero){
        this.numero = numero;
        System.out.println("Hilo creado, con numero: " + numero);
    }



    @Override 
    public void run(){
        for (int i = 0; i < 5; i++){
             System.out.println("Desde el hilo con identificador: "+ numero + " imprimo el: " + i);
        }
        
    }





    
}