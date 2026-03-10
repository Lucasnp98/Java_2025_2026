public class Libro
{

    private String titulo;
    private int anio;

    public Libro(String titulo, int anio){
        this.titulo = titulo;
        this.anio = anio;

    }



    @Override

    public String toString(){


        return "Titulo: " + titulo + " Año: " + anio;
    }




}