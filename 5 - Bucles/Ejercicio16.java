import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un numero: ");
    int numero = Integer.parseInt(sc.nextLine());
    sc.close();

    int i = 2;
    boolean esPrimo = true;

    while (numero != i && esPrimo) {
      if (numero % i == 0) {
        esPrimo = false;
      }
      i++;
    }
    System.out.println(esPrimo);
  }
}