public class Coche
{
    private String matricula;
    private String modelo;


    Coche(String matricula, String modelo)
    {
    this.matricula = matricula;
    this.modelo = modelo;
    }


    @Override
    public String toString(){
        return "Matricula: " + matricula + " Modelo: " + modelo;
    }



}