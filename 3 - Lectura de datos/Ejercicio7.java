public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    double iva = 21;
    double total;

    total = baseImponible * ((iva / 100) + 1);
    
    System.out.printf("El total de la factura es de: %.2f€", total);


  }
}
