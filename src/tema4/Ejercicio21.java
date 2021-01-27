package tema4;

public class Ejercicio21 {
  public static void main(String[] args) {

    System.out.print("Nota del primer control: ");
    Double primerExamen = Double.parseDouble(System.console().readLine());

    System.out.print("Nota del segundo control: ");
    Double segundoExamen = Double.parseDouble(System.console().readLine());

    double notaMedia = (primerExamen + segundoExamen) / 2;

    if (notaMedia >= 5) {
      System.out.printf("Tu nota de Programación es: %.2f", notaMedia);
    } else {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
      String recuperado = System.console().readLine();
      if (recuperado.equals("apto")) {
        System.out.println("Tu nota de Programación es: " + 5);
      } else if (recuperado.equals("no apto")) {
        System.out.println("Tu nota de Programación es: " + notaMedia);
      }
    }
  }
}