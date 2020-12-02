
public class Ejercicio11 {
  public static void main(String[] args) {

    int suspensos = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;

    for (int i = 0; i < 20; i++) {
      int nota = (int) (Math.random() * (5) + 1);
      switch (nota) {
        case 1:
          suspensos++;
          break;
        case 2:
          suficiente++;
          break;
        case 3:
          bien++;
          break;
        case 4:
          notable++;
          break;
        case 5:
          sobresaliente++;
          break;

        default:
          break;
      }
    }

    System.out.println("Suspensos: " + suspensos);
    System.out.println("Suficiente: " + suficiente);
    System.out.println("Bien: " + bien);
    System.out.println("Notable: " + notable);
    System.out.println("Sobresaliente: " + sobresaliente);
  }
}