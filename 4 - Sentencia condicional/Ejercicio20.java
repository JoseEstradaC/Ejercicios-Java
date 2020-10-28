public class Ejercicio20 {
  public static void main(String[] args) {

    System.out.println("Este programa comprueba si un numero es capicúa");

    System.out.print("Introduce un numero: ");
    String numero = System.console().readLine();

    if (numero.length() <= 5) {
      if (new StringBuilder(numero).reverse().toString().equals(numero)) {
        System.out.println("El numero " + numero + " es capicua");
      } else {
        System.out.println("El numero " + numero + " no es capicua");
      }
      
    } else {
      System.out.println("El numero supera las 5 cifras");
    }
    

    
    
  }
}