
public class Ejercicio13 {
  public static void main(String[] args) {

    int dado1 = 0;
    int dado2 = 0;
    int tiradas = 1;
    do {
      dado1 = (int) (Math.random() * (6)) + 1;
      dado2 = (int) (Math.random() * (6)) + 1;
      System.out.println("Tirada numero: " + tiradas);
      if (dado1 == dado2) {
        System.out.println("  Dados Iguales");
        System.out.println("    Dado 1: " + dado1);
        System.out.println("    Dado 2: " + dado2);
      } else {
        System.out.println("  Dados Distintos");
        System.out.println("    Dado 1: " + dado1);
        System.out.println("    Dado 2: " + dado2);
      }
      tiradas++;
    } while (!(dado1 == dado2));

  }
}