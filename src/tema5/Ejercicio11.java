package tema5;

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    int numero = Integer.parseInt(sc.nextLine());
    sc.close();

    for (int i = numero; i < (numero + 5); i++) {
      System.out.printf("%6d %8d %10d\n", i, i * i, i * i * i);
    }

  }
}
