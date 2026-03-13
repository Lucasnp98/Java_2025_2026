
import java.util.ArrayList;

public abstract class Deportista implements Comparable {
  String nombre;
  double peso;
  String patrocinador;
  ArrayList<Entrenamiento> entrenamientos;
  
  public Deportista(String nombre, double peso, String patrocinador) {
    this.nombre = nombre;
    this.peso = peso;
    this.patrocinador = patrocinador;
    this.entrenamientos = new ArrayList<>();
  }
  
  public void addEntrenamiento(Entrenamiento entrenamiento) {
    this.entrenamientos.add(entrenamiento);
  }
  
  public ArrayList<Entrenamiento> getEntrenamientos() {
    return entrenamientos;
  }

  public double gastoEnergeticoSemanal() {
    double gastoTotal = 24 * this.peso * 7;
    for (Entrenamiento entrenamiento : entrenamientos) {
      gastoTotal += entrenamiento.calcularCaloriasQuemadas(this.peso);
    }
    return gastoTotal;
  }

  public String getNombre() {
    return nombre;
  }

  public abstract double getTiempoRecuperacion();
  

  @Override
  public int compareTo(Object o) {
    if(o instanceof Deportista d) {
      return this.nombre.compareTo(d.getNombre());
    }
    else return -1;
  }
  String entrenamientosToString() {
    StringBuilder sb = new StringBuilder();
    for (Entrenamiento e : entrenamientos) {
      sb.append(e.toString()).append("; ");
    }
    return sb.toString();
  }
@Override
public String toString() {

    String texto = "";

    texto += "Nombre: " + nombre + "\n";
    texto += "Tipo: " + this.getClass().getSimpleName() + "\n";
    texto += "Peso: " + peso + " kg\n";
    texto += "Patrocinador: " + patrocinador + "\n";
    texto += "Entrenamientos: " + entrenamientosToString() + "\n";
    texto += String.format("Gasto energético semanal: %.0f kcal\n", gastoEnergeticoSemanal());
    texto += String.format("Tiempo de recuperación recomendado: %.0f h\n", getTiempoRecuperacion());

    if(this instanceof ParticipaCompeticiones){
        ParticipaCompeticiones dpc = (ParticipaCompeticiones) this;
        texto += "Competiciones esta semana: " + dpc.getPartidosSemana();
    }

    return texto;
}
}