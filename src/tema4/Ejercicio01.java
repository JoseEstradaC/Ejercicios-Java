package tema4;

public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.print("Introduzca el dia de la semana: ");
    String diaDeLaSemana = System.console().readLine().toLowerCase();

    switch (diaDeLaSemana) {
      case "lunes":
        System.out.println("El " + diaDeLaSemana + " hay a primera hora hay clase de EED");

        break;
      case "martes":
        System.out.println("El " + diaDeLaSemana + " hay a primera hora hay clase de programación");

        break;
      case "miércoles":
        System.out.println("El " + diaDeLaSemana + " hay a primera hora hay clase de programación");

        break;
      case "jueves":
        System.out.println("El " + diaDeLaSemana + " hay a primera hora hay clase de programación");

        break;
      case "viernes":
        System.out.println("El " + diaDeLaSemana + " hay a primera hora hay clase de FOL");

        break;

      default:
        if (diaDeLaSemana.equals("sabado") || diaDeLaSemana.equals("domingo")) {
          System.out.println("Ese dia no hay clase");
        } else {
          System.out.println("En la tierra el dia" + diaDeLaSemana + " no existe");
        }

        break;
    }

  }
}
