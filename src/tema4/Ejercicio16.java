package tema4;

public class Ejercicio16 {
  public static void main(String[] args) {

    System.out.println("Este programa es un test para saber si estas siendo infiel");

    System.out.println("Introduce verdadero o falso según la pregunta.");

    int puntos = 0;
    String respuesta = "";

    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    respuesta = System.console().readLine().toLowerCase();
    if (respuesta.equals("verdadero")) {
      puntos = puntos + 3;
    }

    System.out.println("2. Ha aumentado sus gastos de vestuario");
    respuesta = System.console().readLine().toLowerCase();
    if (respuesta.equals("verdadero")) {
      puntos = puntos + 3;
    }

    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    respuesta = System.console().readLine().toLowerCase();
    if (respuesta.equals("verdadero")) {
      puntos = puntos + 3;
    }
    System.out.println(
        "4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    respuesta = System.console().readLine().toLowerCase();
    if (respuesta.equals("verdadero")) {
      puntos = puntos + 3;
    }

    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    respuesta = System.console().readLine().toLowerCase();
    if (respuesta.equals("verdadero")) {
      puntos = puntos + 3;
    }

    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    respuesta = System.console().readLine().toLowerCase();
    if (respuesta.equals("verdadero")) {
      puntos = puntos + 3;
    }

    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    respuesta = System.console().readLine().toLowerCase();
    if (respuesta.equals("verdadero")) {
      puntos = puntos + 3;
    }

    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    respuesta = System.console().readLine().toLowerCase();
    if (respuesta.equals("verdadero")) {
      puntos = puntos + 3;
    }

    System.out.println("9. Has notado que últimamente se perfuma más");
    respuesta = System.console().readLine().toLowerCase();
    if (respuesta.equals("verdadero")) {
      puntos = puntos + 3;
    }

    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    respuesta = System.console().readLine().toLowerCase();
    if (respuesta.equals("verdadero")) {
      puntos = puntos + 3;
    }

    if (puntos <= 10) {
      System.out.println("Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if (puntos <= 22) {
      System.out.println(
          "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if (puntos <= 30) {
      System.out.println(
          "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }

  }
}
