
public class Ejercicio08 {
  public static void main(String[] args) {

    int numeroAleatorio = (int) (Math.random() * (6) + 1);

    if (numeroAleatorio >= 1 && numeroAleatorio <= 3) {
      System.out.println("1");
    }
    if (numeroAleatorio >= 4 && numeroAleatorio <= 5) {
      System.out.println("2");
    }
    if (numeroAleatorio == 6) {
      System.out.println("3");
    }

  }
}