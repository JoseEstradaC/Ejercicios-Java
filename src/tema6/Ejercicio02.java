package tema6;

public class Ejercicio02 {
  public static void main(String[] args) {

    int numeroPalo = (int) (Math.random() * 4) + 1;

    String palo = "";

    switch (numeroPalo) {
      case 1:
        palo = "picas";
        break;
      case 2:
        palo = "corazones";
        break;
      case 3:
        palo = "diamantes";
        break;
      case 4:
        palo = "tréboles";
        break;

      default:
        break;
    }

    int numeroCarta = (int) (Math.random() * 13) + 1;
    String carta = "";

    switch (numeroCarta) {
      case 1:
        carta = "A";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;

      default:
        carta = String.valueOf(numeroCarta);
        break;
    }

    System.out.println("Carta aleatoria: " + carta + " de " + palo);
  }
}
