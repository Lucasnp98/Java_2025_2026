import java.util.ArrayList;
public class Cliente {

String nombre;
String dni;
ArrayList<Tarjeta> tarjetas;


public Cliente(String nombre, String dni, ArrayList<Tarjeta> tarjetas){
    this.nombre = nombre;
    this.dni = dni;
    this.tarjetas = tarjetas;
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

public void setDni(String dni) {
    this.dni = dni;
}

public ArrayList<Tarjeta> getTarjetas() {
    return tarjetas;
}

public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
    this.tarjetas = tarjetas;
}



@Override
public String toString(){
    return "Nombre: " + nombre + " DNI: " + dni + " Saldo total: " + calculaSaldoTotal();
}


public double calculaSaldoTotal(){
    double saldo_total = 0;
    for (Tarjeta t:tarjetas)
    {
        saldo_total = saldo_total + t.calculaSaldo();
    }
    return saldo_total;
}







}
