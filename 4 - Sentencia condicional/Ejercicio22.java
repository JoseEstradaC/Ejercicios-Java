public class Ejercicio22 {
  public static void main(String[] args) {

    System.out.print("Introduzca el dia de semana en numero: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());

    int minutosFaltantes = (hora * 60) + minutos + (dia * 1440);

    System.out.println("Faltan " + (8100 - minutosFaltantes));


  }
}
