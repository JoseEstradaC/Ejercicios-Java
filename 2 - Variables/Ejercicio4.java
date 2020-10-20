public class Ejercicio4 {
  public static void main(String[] args) {
    float euros = 500;
    double equivalenciaEurosPeseta = 166.3860;
    double pesetas;

    pesetas = euros * equivalenciaEurosPeseta;

    System.out.printf("%.2f€ Son %.0f pesetas", euros, pesetas);
  }
}