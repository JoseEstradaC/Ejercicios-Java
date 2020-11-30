import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {

    int suma = 0;

    for (int i = 0; i <= 2; i++) {
      int tirada = (int) (Math.random() * 6) + 1;
      System.out.println("Tirada nº " + (i + 1) + ": " + tirada);
      suma = suma + tirada;

    }
    System.out.println("El total de puntos son: " + suma);

  }
}
