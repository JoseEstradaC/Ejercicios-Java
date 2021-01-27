package tema4;

public class Ejercicio17 {
  public static void main(String[] args) {

    System.out.println("Este programa devuelve la ultima cifra de un numero entero");

    System.out.print("Introduce un numero: ");
    String numero = System.console().readLine();

    System.out.println("Su última cifra es: " + (numero.charAt((numero.length() - 1))));

  }
}
