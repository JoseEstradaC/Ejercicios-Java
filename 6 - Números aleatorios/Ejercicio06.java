import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {

    boolean numeroCorrecto = false;
    int numeroAleatorio = (int) (Math.random() * (100) + 1);
    System.out.println(numeroAleatorio);

    int intentos = 0;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("Introduce un numero: ");
      int numero = Integer.parseInt(sc.nextLine());

      if (numero == numeroAleatorio) {
        numeroCorrecto = true;
        System.out.println("El numero introducido es correcto");
      } else {
        if (numero > numeroAleatorio) {
          System.out.println("El numero introducido es mayor que el aleatorio");
        } else {
          System.out.println("El numero introducido es menor que el aleatorio");
        }
        intentos++;
        System.out.println("Numero de intentos restantes: " + (5 - intentos));
      }

    } while (!numeroCorrecto && intentos <= 5);
  }
}
