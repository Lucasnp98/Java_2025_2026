

public class App {

public static void main (String args[]){

  Arma a = new Arma(0,10);
  Arma a2 = new Arma(200,10);
  Soldado s1 = new Soldado(110,"Lucas", a);
  Soldado s2 = new Soldado(110,"Manolo", a2);
 
  Arbol arbol = new Arbol(10, 2);


  Baya baya = new Baya(10);


  s2.picar(s1);

  s1.picar(arbol);
  //s1.picar(baya);
  System.out.println(s1);
  s1.picar(arbol);
  System.out.println(s1);
  s1.picar(arbol);
  System.out.println(s1);








  

}

    
}
