package tema4;

public class Ejercicio10 {
  public static void main(String[] args) {

    String horoscopo = "";

    System.out.println("Este programa resuelve ecuaciones de segundo grado");

    System.out.print("Dia de nacimiento: ");
    int DiaNacimento = Integer.parseInt(System.console().readLine());
    System.out.print("Mes de nacimiento (En numero): ");
    int mesNacimiento = Integer.parseInt(System.console().readLine());

    switch (mesNacimiento) {
      case 1:
        if (DiaNacimento <= 20) {
          horoscopo = "capricornio";
        } else {
          horoscopo = "acuario";
        }
        break;
      case 2:
        if (DiaNacimento <= 19) {
          horoscopo = "acuario";
        } else {
          horoscopo = "piscis";
        }
        break;
      case 3:
        if (DiaNacimento <= 20) {
          horoscopo = "piscis";
        } else {
          horoscopo = "aries";
        }
        break;
      case 4:
        if (DiaNacimento <= 20) {
          horoscopo = "aries";
        } else {
          horoscopo = "tauro";
        }
        break;
      case 5:
        if (DiaNacimento <= 19) {
          horoscopo = "tauro";
        } else {
          horoscopo = "géminis";
        }
        break;
      case 6:
        if (DiaNacimento <= 21) {
          horoscopo = "géminis";
        } else {
          horoscopo = "cáncer";
        }
        break;
      case 7:
        if (DiaNacimento <= 21) {
          horoscopo = "cáncer";
        } else {
          horoscopo = "Leo";
        }
        break;
      case 8:
        if (DiaNacimento <= 23) {
          horoscopo = "leo";
        } else {
          horoscopo = "virgo";
        }
        break;
      case 9:
        if (DiaNacimento <= 22) {
          horoscopo = "virgo";
        } else {
          horoscopo = "libra";
        }
        break;
      case 10:
        if (DiaNacimento <= 22) {
          horoscopo = "libra";
        } else {
          horoscopo = "escorpio";
        }
        break;
      case 11:
        if (DiaNacimento <= 22) {
          horoscopo = "escorpio";
        } else {
          horoscopo = "sagitario";
        }
        break;
      case 12:
        if (DiaNacimento <= 20) {
          horoscopo = "sagitario";
        } else {
          horoscopo = "capricornio";
        }
        break;
      default:
        horoscopo = "Desconocido";
    }

    System.out.println("Tu horóscopo es: " + horoscopo);

  }
}
