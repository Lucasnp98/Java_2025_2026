public class Persona {


    int edad;
    String nombre;
    String dni;

    


    public void setDni(String dni) {
        this.dni = dni;
    }


    public Persona(int edad, String nombre, String dni){

        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
    }




  
  @Override
    public String toString(){
        return "Dni: " + dni + " Nombre: " + nombre; 
    }

   @Override
    public boolean equals(Object obj){


        if (obj instanceof Persona){
            Persona p = (Persona)obj;

            return p.getNombre().equals(nombre);
            
        }else{
            return false;
        }


    }

    


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDni() {
        return dni;
    }



    
}
