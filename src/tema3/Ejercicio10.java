package tema3;

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.print("Introduzca la cantidad de Mb: ");
    int mb = Integer.parseInt(System.console().readLine());

    int kb = mb * 1024;

    System.out.printf(mb + " Mb son " + kb + " Kb");

  }
}
