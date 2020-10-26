public class Ejercicio04 {
  public static void main(String[] args) {
    float euros = 500;
    double equivalenciaEurosPeseta = 166.386;
    int pesetas;

    pesetas = (int) (euros * equivalenciaEurosPeseta);

    System.out.printf("%.2f€ Son %d pesetas", euros, pesetas);
  }
}