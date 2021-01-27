package tema3;

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Introduzca la nota del primer examen: ");
    double notaPrimerExamen = Double.parseDouble(System.console().readLine());

    System.out.print("¿Qué nota quieres sacar en el trimestre: ");
    double notaDeseada = Double.parseDouble(System.console().readLine());

    double notaSegundoExamen = (notaDeseada - (notaPrimerExamen * 0.40)) / 0.60;

    System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen.",
        notaPrimerExamen, notaSegundoExamen);

  }
}
