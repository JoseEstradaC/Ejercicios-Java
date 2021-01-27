package tema4;

public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.print("Introduzca un numero del 1 al 7: ");
    int diaDeLasSemanaNumero = Integer.parseInt(System.console().readLine());

    switch (diaDeLasSemanaNumero) {
      case 1:
        System.out.print("El dia de la semana numero " + diaDeLasSemanaNumero + " es el Lunes");

        break;
      case 2:
        System.out.print("El dia de la semana numero " + diaDeLasSemanaNumero + " es el Martes");

        break;
      case 3:
        System.out.print("El dia de la semana numero " + diaDeLasSemanaNumero + " es el Miércoles");

        break;
      case 4:
        System.out.print("El dia de la semana numero " + diaDeLasSemanaNumero + " es el Jueves");

        break;
      case 5:
        System.out.print("El dia de la semana numero " + diaDeLasSemanaNumero + " es el Viernes");

        break;
      case 6:
        System.out.print("El dia de la semana numero " + diaDeLasSemanaNumero + " es el Sábado");

        break;
      case 7:
        System.out.print("El dia de la semana numero " + diaDeLasSemanaNumero + " es el Domingo");

        break;

      default:
        break;
    }
  }
}