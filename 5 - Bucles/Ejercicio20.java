import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un la altura de la pirámide: ");
    int altura = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca un carácter: ");
    String caracter = sc.nextLine();
    sc.close();

    int espacios = altura - 1;
    int caracteresAPintar = 1;
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      for (int h = 0; h < caracteresAPintar; h++) {
        if (h == 0 || h == caracteresAPintar - 1) {
          System.out.print(caracter);
        } else {
          if (i == altura - 1) {
            System.out.print(caracter);
          } else {
            System.out.print(" ");
          }

        }
      }
      espacios--;
      caracteresAPintar = caracteresAPintar + 2;

      System.out.println();
    }
  }
}
