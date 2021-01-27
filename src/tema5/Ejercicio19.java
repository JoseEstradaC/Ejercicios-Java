package tema5;

import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un la altura de la pirámide: ");
    int altura = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca un carácter: ");
    String caracter = sc.nextLine();
    sc.close();

    int espacios = altura - 1;
    int caracteresAPirtar = 1;
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      for (int h = 0; h < caracteresAPirtar; h++) {
        System.out.print(caracter);
      }
      espacios--;
      caracteresAPirtar = caracteresAPirtar + 2;

      System.out.println();
    }
  }
}
