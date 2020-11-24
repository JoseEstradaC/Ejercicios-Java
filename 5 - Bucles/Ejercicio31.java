import java.util.Scanner;

public class Ejercicio31 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un la altura de la L: ");
    int altura = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < altura; i++) {
      if (i == altura - 1) {
        System.out.print("*");
      } else {
        System.out.println("*");
      }
    }

    for (int i = 0; i < altura / 2; i++) {
      System.out.print(" *");
    }
  }
}
