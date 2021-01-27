package tema5;

import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {

    System.out.println("Introduzca un numero entero: ");

    Scanner sc = new Scanner(System.in);
    int numero = Integer.parseInt(sc.nextLine());
    sc.close();

    int cantidadDigitos = 0;

    while (!(numero == 0)) {
      cantidadDigitos++;
      numero = numero / 10;
    }
    System.out.println("La cantidad de dígitos del numero es de: " + cantidadDigitos);

  }
}
