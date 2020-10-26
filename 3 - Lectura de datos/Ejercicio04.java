public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.print("Introduzca un primer numero: ");
    double x = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca un segundo numero: ");
    double y = Double.parseDouble(System.console().readLine());

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println((double) x / (double) y);
    System.out.println(x * y);

    }
}
