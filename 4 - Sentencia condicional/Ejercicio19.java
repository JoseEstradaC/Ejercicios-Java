public class Ejercicio19 {
  public static void main(String[] args) {

    System.out.println("Este programa devuelve la longitud numero entero");

    System.out.print("Introduce un numero: ");
    String numero = System.console().readLine();

    if (numero.length() <= 5) {
      if (numero.charAt(0) == '-') {
        System.out.println("Su longitud es de: " + (numero.length() - 1));
      } else {
        System.out.println("Su longitud es de: " + (numero.length()));
      }
      
    } else {
      System.out.println("El numero supera las 5 cifras");
    }
    

    
    
  }
}

