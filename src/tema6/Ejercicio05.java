package tema6;

public class Ejercicio05 {
  public static void main(String[] args) {

    int maximo = 0;
    int minimo = 199;
    int suma = 0;

    for (int i = 0; i < 50; i++) {
      int numeroAleatorio = (int) (Math.random() * (199 - 99) + 100);
      System.out.println(numeroAleatorio);
      if (numeroAleatorio > maximo) {
        maximo = numeroAleatorio;
      }
      if (numeroAleatorio < minimo) {
        minimo = numeroAleatorio;
      }
      suma = suma + numeroAleatorio;
    }
    System.out.println("|| min: " + minimo + " || max: " + maximo + " || media: " + (suma / 50) + "||");
  }
}
