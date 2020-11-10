import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int posivos = 0;
    for (int i = 0; i <= 10; i++) {
      System.out.print("Introduzca un número: ");
      int numero = Integer.parseInt(sc.nextLine());
      if (numero >= 0) {
        posivos++;
      }
    }
    System.out.println("Hay " + posivos + " números positivos");
    System.out.println("Hay " + (10 - posivos) + " números positivos");
    sc.close();


  }
}
