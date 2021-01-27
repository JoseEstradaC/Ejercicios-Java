package tema5;

import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.print("Tabla multiplicar del: ");

    Scanner sc = new Scanner(System.in);
    int tablaMultiplicar = Integer.parseInt(sc.nextLine());
    sc.close();

    for (int i = 0; i <= 10; i++) {
      System.out.printf("%2d * %2d = %3d\n", tablaMultiplicar, i, (tablaMultiplicar * i));
    }

  }
}
