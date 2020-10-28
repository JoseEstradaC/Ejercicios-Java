public class Ejercicio18 {
  public static void main(String[] args) {

    System.out.println("Este programa devuelve la primera cifra de un numero entero");

    System.out.print("Introduce un numero: ");
    String numero = System.console().readLine();

    if (numero.length() <= 5) {
      System.out.println("Su primera cifra es: " + (numero.charAt(0)));
    } else {
      System.out.println("El numero supera las 5 cifras");
    }
    

    
    
  }
}

