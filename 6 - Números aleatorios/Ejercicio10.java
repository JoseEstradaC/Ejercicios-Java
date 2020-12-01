
public class Ejercicio10 {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {

      int logintudLinea = (int) (Math.random() * (40) + 1);
      int numeroCaracter = (int) (Math.random() * 7);
      char caracter = ' ';

      switch (numeroCaracter) {
        case 0:
          caracter = '*';
          break;
        case 1:
          caracter = '-';

          break;
        case 2:
          caracter = '=';

          break;
        case 3:
          caracter = '.';

          break;
        case 4:
          caracter = '|';

          break;
        case 5:
          caracter = '@';

          break;

        default:
          break;
      }

      for (int j = 0; j < logintudLinea; j++) {
        System.out.print("" + caracter);
      }
      System.out.println();
    }
  }
}