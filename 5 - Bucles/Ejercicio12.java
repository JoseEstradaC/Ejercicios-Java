import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    int cantidadFibonacci = Integer.parseInt(sc.nextLine());
    sc.close();

    if (cantidadFibonacci == 1) {
      System.out.print("0"); 
    } else if (cantidadFibonacci == 2) {
      System.out.print("0 1"); 
    } else if (cantidadFibonacci >= 3) {
      int a = 0;
      int b = 1;
      int c = 0;
      int n = 2;
      System.out.print("0 1 ");
      do {
        c = b;
        b = a + b;
        a = c;
        n++;
        System.out.print(b + " ");
      } while (n <= cantidadFibonacci);
    }
  }
}
