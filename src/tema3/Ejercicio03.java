package tema3;

public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.print("Introduzca la cantidad de pesetas: ");
    int pesetas = Integer.parseInt(System.console().readLine());

    double equivalenciaPesetaEuros = 166.386;

    double euros = pesetas / equivalenciaPesetaEuros;

    System.out.printf("%d pesetas son %.2f€", pesetas, euros);

  }
}
