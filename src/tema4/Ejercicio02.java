package tema4;

public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.print("Introduzca una hora del dia: ");
    int horaDelDia = Integer.parseInt(System.console().readLine());

    if (horaDelDia >= 6 && horaDelDia <= 12) {
      System.out.print("Buenos días");
    } else {
      if (horaDelDia >= 13 && horaDelDia <= 20) {
        System.out.print("Buenas tardes");
      } else {
        if ((horaDelDia >= 21 && horaDelDia <= 23) || (horaDelDia >= 0 && horaDelDia <= 5)) {
          System.out.print("Buenas noches");
        } else {
          System.out.println("Te has inventado una hora, felicidades!!");
        }
      }
    }
  }
}
