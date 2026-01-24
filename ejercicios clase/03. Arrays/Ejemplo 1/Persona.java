public class Persona{



    String nombre;
    String dni;
    int altura;
    Coche coche;







    public Persona(String nombre, String dni, int altura, Coche coche){

            this.nombre = nombre;
            this.dni = dni;
            this.altura = altura;
            this.coche = coche;


    }




    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public Coche  getCoche()
    {
        return this.coche;
    }

    public void setCoche(Coche coche){

        this.coche = coche;

    }


    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }


    public void imprimir_info(){

        System.out.println("Nombre: " + this.nombre + " y mi dni es: " + this.dni);




    }






    
}