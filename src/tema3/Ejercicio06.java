package tema3;

public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la altura: ");
    double altura = Double.parseDouble(System.console().readLine());

    System.out.println("El área del triángulo es: " + ((base * altura) / 2));
  }
}
