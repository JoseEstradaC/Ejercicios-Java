package tema4;

public class Ejercicio15 {
  public static void main(String[] args) {

    System.out.println(
        "Este programa crea un pirámide a partir de un carácter dado por el usuario ademas de seleccionar hacia donde apunta");

    System.out.print("Introduzca el carácter: ");
    char caracter = System.console().readLine().charAt(0);

    System.out.print(
        "Por favor seleccione la dirección donde apuntara su pirámide, para ello introduce el numero de la dirección \n 1 - Izquierda \n 2 - Derecha \n 3 - Abajo \n 4 - Arriba \n Introduzca el número: ");
    int direccion = Integer.parseInt(System.console().readLine());

    System.out.println("------------------------");

    switch (direccion) {
      case 1:
        System.out.println("" + " " + " " + " " + " " + caracter);
        System.out.println("" + " " + " " + " " + caracter + caracter);
        System.out.println("" + " " + " " + caracter + caracter + caracter);
        System.out.println("" + " " + caracter + caracter + caracter + caracter);
        System.out.println("" + caracter + caracter + caracter + caracter + caracter);
        System.out.println("" + " " + caracter + caracter + caracter + caracter);
        System.out.println("" + " " + " " + caracter + caracter + caracter);
        System.out.println("" + " " + " " + " " + caracter + caracter);
        System.out.println("" + " " + " " + " " + " " + caracter);
        break;
      case 2:
        System.out.println("" + caracter);
        System.out.println("" + caracter + caracter);
        System.out.println("" + caracter + caracter + caracter);
        System.out.println("" + caracter + caracter + caracter + caracter);
        System.out.println("" + caracter + caracter + caracter + caracter + caracter);
        System.out.println("" + caracter + caracter + caracter + caracter);
        System.out.println("" + caracter + caracter + caracter);
        System.out.println("" + caracter + caracter);
        System.out.println("" + caracter);
        break;
      case 3:
        System.out.println(
            "" + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        System.out.println(" " + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        System.out.println(" " + " " + caracter + caracter + caracter + caracter + caracter);
        System.out.println(" " + " " + " " + caracter + caracter + caracter);
        System.out.println(" " + " " + " " + " " + caracter);
        break;
      case 4:
        System.out.println(" " + " " + " " + " " + caracter);
        System.out.println(" " + " " + " " + caracter + caracter + caracter);
        System.out.println(" " + " " + caracter + caracter + caracter + caracter + caracter);
        System.out.println(" " + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        System.out.println(
            "" + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        break;

      default:
        break;
    }
    System.out.println("------------------------");
  }
}
