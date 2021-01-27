package tema3;

public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.print("Introduzca las horas trabajadas: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    double precioDeHora = 12;
    double total;

    total = precioDeHora * horasTrabajadas;

    System.out.printf("Salario semanal: %.2f€", total);

  }
}
