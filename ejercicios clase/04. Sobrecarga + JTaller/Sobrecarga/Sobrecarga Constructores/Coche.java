public class Coche{


    String matricula;
    int km;
    String modelo;

    public Coche(String matricula, String modelo, int km)
    {
        this.matricula = matricula;
        this.modelo = modelo;
        this.km = km;
    }
    
    public Coche(String matricula){
        this(matricula, "Sin modelo", 0);
    }

    public Coche(String matricula, int km){
        this(matricula,"Sin Modelo" , km);
       

    }

    public void mostrar_info(){
        System.out.println("Matricula: " + this.matricula + " Modelo: " + this.modelo + " KM: " + this.km);
    }



}