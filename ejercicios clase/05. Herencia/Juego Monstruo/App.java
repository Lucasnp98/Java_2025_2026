

public class App {

public static void main (String args[]){

  Arma a = new Arma(0,10);
  Arma a2 = new Arma(200,10);
  Soldado s1 = new Soldado(110,"Lucas", a);
  Soldado s2 = new Soldado(100, "Manolo", a2);


  Monstruo monstruo = new Monstruo(100, "Bowser", 20);

  JefeFinal jefe = new JefeFinal(55, "TFG", 40);


//   monstruo.atacar(s1);


  
  
  s1.getArma().recargar();
  s1.atacar(jefe);

  
  jefe.atacar(s1);



//   s1.atacar(s2);
//   s2.atacar(monstruo);
  System.out.println(s1);
  System.out.println(s2);
  System.out.println(monstruo);
  System.out.println(jefe);


}

    
}
