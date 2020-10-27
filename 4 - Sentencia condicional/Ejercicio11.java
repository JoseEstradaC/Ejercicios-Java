public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("Este programa calcula cuantas segundos falta para la media noche ");

    System.out.print("Introduzca la hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());

    int horasEnSegundos = (horas * 60) * 60;
    int minutosEnSegundos = minutos * 60;

    System.out.println("Para media noche faltan " + (86400 - (horasEnSegundos + minutosEnSegundos) ) + " segundos");
  }   
}
