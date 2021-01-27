package tema5;

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double total = 0;
    int cantidadDeNumeros = 0;
    double numero = 0;

    System.out.println(
        "Calculo de media, introduce números para calcular su media, para finalizar el programa introduzca un numero negativo");

    do {
      System.out.println("Introduzca un numero: ");
      numero = Double.parseDouble(sc.nextLine());
      if (numero >= 0) {
        total = total + numero;
        cantidadDeNumeros++;
      }
    } while (numero >= 0);

    sc.close();

    System.out.println("" + cantidadDeNumeros + " " + (total / cantidadDeNumeros));
  }
}
