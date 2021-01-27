package tema4;

public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la nota media de tres notas");

    System.out.print("Introduzca la primera nota: ");
    Double primeraNota = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la segunda nota: ");
    Double segundaNota = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la tercera nota: ");
    Double terceraNota = Double.parseDouble(System.console().readLine());

    System.out.printf("La nota media es: %.2f", ((primeraNota + segundaNota + terceraNota) / 3));

  }
}
