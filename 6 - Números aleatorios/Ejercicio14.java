import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rangoMaximo = 101;
    int rangoMinimo = 0;
    boolean fin = false;
    int intentos = 0;
    do {
      int numeroAleatorio = (int) (Math.random() * (rangoMaximo - rangoMinimo)) + rangoMinimo;
      System.out.println("El numero " + numeroAleatorio + " es tu numero (si o no)");

      String correcto = sc.nextLine();

      if (correcto.equals("si")) {
        fin = true;
      } else if (correcto.equals("no")) {
        System.out.println("El numero " + numeroAleatorio + " es menor o mayor que tu numero");
        String mayorOMenor = sc.nextLine();

        if (mayorOMenor.equals("mayor")) {
          rangoMaximo = numeroAleatorio;
        } else if (mayorOMenor.equals("menor")) {
          rangoMinimo = numeroAleatorio;
        }
        intentos++;
      }

    } while (!fin && intentos < 5);

  }
}