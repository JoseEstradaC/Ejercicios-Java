
public class Ejercicio12 {
  public static void main(String[] args) {

    System.out.print("\u001B[32m");
    while (true) {
      int numero = (int) (Math.random() * (126 - 32) + 1) + 32;
      System.out.print(Character.toChars(numero));
      long nanos = 350000;
      long elapsed;
      final long startTime = System.nanoTime();
      do {
        elapsed = System.nanoTime() - startTime;
      } while (elapsed < nanos);
    }
  }
}