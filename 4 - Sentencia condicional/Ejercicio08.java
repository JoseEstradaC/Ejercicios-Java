public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la nota media de tres notas");
    
    System.out.print("Introduzca la primera nota: ");
    Double primeraNota = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la segunda nota: ");
    Double segundaNota = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la tercera nota: ");
    Double terceraNota = Double.parseDouble(System.console().readLine());

    Double media = (primeraNota + segundaNota + terceraNota) / 3;

    String calificacion = "";

    if (media <= 4.99) {
      calificacion = "insuficiente";
    } else {
      if (media < 5.99) {
        calificacion = "suficiente";
      } else {
        if (media < 6.99) {
          calificacion = "bien";
        } else {
          if (media < 8.99) {
            calificacion = "notable";
          } else {       
            if (media <= 10) {
              calificacion = "sobresaliente";
            }
          }
        }
      }
    }

    System.out.println("Su calificación es: " + calificacion);

  }   
}
