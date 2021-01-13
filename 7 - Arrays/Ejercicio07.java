import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

    // int[] numeros = new int[15];

    for (int i = 0; i < numeros.length; i++) {
      int numero = (int) (Math.random() * 21);
      numeros[i] = numero;
      System.out.print(numero + " ");
    }

    System.out.print("\nIntroduzca un número de la lista: ");
    int num1 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca un numero para sustituir: ");
    int num2 = Integer.parseInt(sc.nextLine());
    sc.close();

    for (int i : numeros) {
      System.out.println(i);
    }

  }
}