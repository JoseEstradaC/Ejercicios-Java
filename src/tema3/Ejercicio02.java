package tema3;

public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.print("Introduzca la cantidad de euros: ");
    double euros = Double.parseDouble(System.console().readLine());

    double equivalenciaEurosPeseta = 166.386;
    int pesetas;

    pesetas = (int) (euros * equivalenciaEurosPeseta);

    System.out.printf("%.2f€ Son %d pesetas", euros, pesetas);
  }
}