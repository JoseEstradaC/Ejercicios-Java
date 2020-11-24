import java.util.Scanner;

public class Ejercicio35 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un la altura de la U: ");
    int altura = Integer.parseInt(sc.nextLine());

    int espaciosInternos = altura - 2;
    int espacios = 0;

    for (int i = 0; i < (altura + 1) / 2; i++) {
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      espacios++;
      if (espaciosInternos > 0) {
        System.out.print("*");
      }
      for (int j = 0; j < espaciosInternos; j++) {
        System.out.print(" ");
      }
      System.out.println("*");

      espaciosInternos = espaciosInternos - 2;
    }

    espaciosInternos = altura - 2;
    espacios = 0;

    for (int i = 0; i < (altura + 1) / 2; i++) {
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      espacios++;
      if (espaciosInternos > 0) {
        System.out.print("*");
      }
      for (int j = 0; j < espaciosInternos; j++) {
        System.out.print(" ");
      }
      System.out.println("*");

      espaciosInternos = espaciosInternos - 2;
    }

  }
}
