public class Coche {

    String matricula;
    String modelo;
    int km;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Coche(String matricula, String modelo, int km){
        this.matricula = matricula;
        this.modelo = modelo;
        this.km = km;
    }

  

    public void mostrar_info(){
        System.out.println("Matricula: " + matricula + "Modelo: "+ modelo);
    }
    
}
