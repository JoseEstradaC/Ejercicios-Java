public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la altura: ");
    double altura = Double.parseDouble(System.console().readLine());

    System.out.println("El área del rectangulo es: " + (base * altura));
  }
}
