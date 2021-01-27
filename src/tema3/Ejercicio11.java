package tema3;

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.print("Introduzca la cantidad de kb: ");
    int kb = Integer.parseInt(System.console().readLine());

    int mb = kb / 1024;

    System.out.printf(kb + " Kb son " + mb + " Mb");

  }
}
