public class Taller {

Coche[] coches;
int numCoches;

public Taller(int capacidad){
    this.coches = new Coche[capacidad];
    this.numCoches = 0;
}



public void addCoche(Coche c){
    if (numCoches < this.coches.length){
        this.coches[numCoches] = c;
        numCoches = numCoches + 1;
    }else{
        System.out.println("No se puede añadir el coche!!");
    }
}


public void mostrarCoches(){

    for (Coche c:this.coches){
        if (c != null){
        c.mostrar_info();
        }
    }
}

public String calcular_maximo(){
    int maximo = 0;
    String matricula = "";
    for(Coche c:this.coches){
        if (c != null){
        if (c.getKm() > maximo){
            maximo = c.getKm();
            matricula = c.getMatricula();
            
        }
    }
    }
    return matricula;
}



    
}