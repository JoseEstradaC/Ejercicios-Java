package tema6;

public class Ejercicio03 {
  public static void main(String[] args) {

    int numeroPalo = (int) (Math.random() * 4) + 1;

    String palo = "";

    switch (numeroPalo) {
      case 1:
        palo = "Bastos";
        break;
      case 2:
        palo = "Copas";
        break;
      case 3:
        palo = "Oros";
        break;
      case 4:
        palo = "Espadas";
        break;

      default:
        break;
    }

    int numeroCarta = (int) (Math.random() * 10) + 1;
    String carta = "";

    switch (numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "Sota";
        break;
      case 12:
        carta = "Caballo";
        break;
      case 13:
        carta = "Rey";
        break;

      default:
        carta = String.valueOf(numeroCarta);
        break;
    }

    System.out.println("Carta aleatoria: " + carta + " de " + palo);
  }
}
