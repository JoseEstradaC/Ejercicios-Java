public class Ejercicio14 {
  public static void main(String[] args) {

    System.out.println("Este programa comprueba si el numero introducido es par y/o divisible entre 5");

    System.out.print("Introduzca el primer numero: ");
    int numero = Integer.parseInt(System.console().readLine());

    if (numero % 2 == 0) {
      System.out.println("El numero introducido es par");
    }
    if (numero % 5 == 0) {
      System.out.println("El numero introducido es divisible entre 5");
    }
  }
}

