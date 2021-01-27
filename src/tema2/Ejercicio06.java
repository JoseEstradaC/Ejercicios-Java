package tema2;

public class Ejercicio06 {
  public static void main(String[] args) {
    double baseImponible = 500;
    double iva = 21;
    double total;

    total = baseImponible * ((iva / 100) + 1);

    System.out.println("El total de la factura es de " + total);
  }
}
