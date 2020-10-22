public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.print("Introduzca un primer numero: ");
    double x = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca un segundo numero: ");
    double y = Double.parseDouble(System.console().readLine());
    System.out.println("El resultado es: " + x * y);
  }
}
