package tema3;

public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.print("Introduzca el radio del cono: ");
    int radio = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la altura del cono: ");
    int altura = Integer.parseInt(System.console().readLine());

    double resultado;

    resultado = (Math.PI * (radio * radio) * altura) / 3;

    System.out.println("El volumen del cono es: " + resultado);

  }
}
