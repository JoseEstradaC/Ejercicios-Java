public class Ejercicio13 {
  public static void main(String[] args) {

    System.out.println("Este programa ordena tres números dados por el usuario");
    int[] orden = new int[3];

    System.out.print("Introduzca el primer numero: ");
    orden[0] = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo numero: ");
    orden[1] = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el tercer numero: ");
    orden[2] = Integer.parseInt(System.console().readLine());

    int temp;

    if (orden[0] < orden[1]) {
      temp = orden[0];
      orden[0] = orden[1];
      orden[1] = temp;
    }

    if (orden[1] < orden[2]) {
      temp = orden[1];
      orden[1] = orden[2];
      orden[2] = temp;
    }

    if (orden[0] < orden[1]) {
      temp = orden[0];
      orden[0] = orden[1];
      orden[1] = temp;
    }

    System.out.println("El orden es: " + orden[0] + " " + orden[1] + " " + orden[2]);
  }
}

