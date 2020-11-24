import java.util.Scanner;

public class Ejercicio33 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un la altura de la U: ");
    int altura = Integer.parseInt(sc.nextLine());

    int ancho = altura - 2;

    for (int i = 0; i < altura; i++) {
      if (i == altura - 1) {
        System.out.print("  ");
        for (int j = 0; j < ancho; j++) {
          System.out.print(" *");
        }
        System.out.println("  ");
      } else {
        System.out.print(" *");
        for (int j = 0; j < ancho; j++) {
          System.out.print("  ");
        }
        System.out.println(" *");

      }
    }

  }
}
