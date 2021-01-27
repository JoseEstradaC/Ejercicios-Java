package tema7;

import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

    // int[] numeros = new int[15];

    for (int i = 0; i < 15; i++) {
      System.out.print("Introduzca el numero " + (i + 1) + ": ");
      numeros[i] = Integer.parseInt(sc.nextLine());
    }
    sc.close();

    int temp1 = numeros[0];
    for (int i = 0; i < numeros.length; i++) {
      if (!(numeros.length == (i + 1))) {
        int temp2 = numeros[i + 1];
        numeros[i + 1] = temp1;
        temp1 = temp2;
      } else {
        numeros[0] = temp1;
      }
    }

    for (int i : numeros) {
      System.out.println(i);
    }

  }
}