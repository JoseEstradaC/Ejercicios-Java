public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int numeroDeHorasTrabajadas = Integer.parseInt(System.console().readLine());
    int numeroDeHorasExtra = 0;

    if (numeroDeHorasTrabajadas > 40) {
      numeroDeHorasExtra = numeroDeHorasTrabajadas - 40;
      numeroDeHorasTrabajadas = 40;
    }

    int sueldoSemanal = numeroDeHorasExtra * 16 + numeroDeHorasTrabajadas * 12;
    
    System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
  }
}