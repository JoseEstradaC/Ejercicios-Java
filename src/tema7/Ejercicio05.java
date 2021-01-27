package tema7;

import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int[] numeros = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduzca el numero " + (i + 1) + ": ");
      numeros[i] = Integer.parseInt(sc.nextLine());
    }
    sc.close();

    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    for (int i = 0; i < numeros.length; i++) {
      int temp = numeros[i];
      if (temp > maximo) {
        maximo = temp;
      }

      if (temp < minimo) {
        minimo = temp;
      }
    }

    System.out.println("El numero máximo es: " + maximo);
    System.out.println("El numero mínimo es: " + minimo);

  }
}