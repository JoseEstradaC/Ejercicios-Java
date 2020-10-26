public class Ejercicio05 {
  public static void main(String[] args) {
    double pesetas = 500;
    double equivalenciaPesetaEuros = 166.386;
    double euros;

    euros = pesetas / equivalenciaPesetaEuros;
    
    System.out.printf("%.2f pesetas son %.2f€", pesetas, euros);
  }
}
