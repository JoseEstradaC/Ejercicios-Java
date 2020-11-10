import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca una base: ");
    int base = Integer.parseInt(sc.nextLine());

    System.out.print("Introduzca una potencia: ");
    int potencia = Integer.parseInt(sc.nextLine());

    sc.close();

    int total = base;
    for (int i = 1; i < potencia; i++) {
      total = total * base;
    }

    System.out.println("El resultado es: " + total);
  }
}