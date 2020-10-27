public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Este programa resuelve ecuaciones de segundo grado");
    
    System.out.print("Introduzca a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la b: ");
    Double b = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la c: ");
    Double c = Double.parseDouble(System.console().readLine());

    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("Infinitas soluciones");
    }

    if ((c != 0) && (a == 0) && (b == 0) ) {
      System.out.println("No tiene solución");
    }

    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("Solución 1 = 0");
      System.out.println("Solución 2 = " + (-b / a));
    }

    if ((b != 0) && (c != 0) && (a == 0)) {
      System.out.println("Solución = " + (-c / b));
    }

    if ((a != 0) && (b != 0) && (c != 0)) {
        
      double dentroDeRaiz = Math.pow(b, 2) - (4 * a * c);
      
      if (dentroDeRaiz < 0) {

        System.out.println("No tiene solución real");

      } else {
        System.out.println("Solución 1 = " + (-b + Math.sqrt(dentroDeRaiz)) / (2 * a));
        System.out.println("Solución 2 = " + (-b - Math.sqrt(dentroDeRaiz)) / (2 * a));
      }
    }

  }   
}
