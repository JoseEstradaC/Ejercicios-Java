package tema6;

public class Ejercicio09 {
  public static void main(String[] args) {

    boolean fin = false;

    while (!fin) {
      int numeroAleatorio = (int) (Math.random() * (101));
      if (numeroAleatorio % 2 == 0) {

        System.out.println(numeroAleatorio);
        if (numeroAleatorio == 24) {
          fin = true;
        }
      }
    }

  }
}