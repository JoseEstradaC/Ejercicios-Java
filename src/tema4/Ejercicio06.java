package tema4;

import static java.lang.Math.sqrt;

public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el tiempo que tarda en caer un objeto");

    System.out.print("Introduzca la altura: ");
    Double altura = Double.parseDouble(System.console().readLine());

    System.out.println("Tarda en caer: " + sqrt((2 * altura) / 9.81) + "segundos");

  }
}
