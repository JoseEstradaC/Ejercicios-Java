import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.print("\033[H\033[2J");  
    System.out.flush(); 
  
    Scanner sc = new Scanner(System.in);

    int[] claveCorrecta = { 1,2,3,4};
    int[] clave = { 0,0,0,0};
    
    boolean esCorrecto = false;
    int intentos = 1;

    do {
      System.out.println("|||||||||||||||||||||||||||||||||"); 
      System.out.println("|| Bienvenido al banco Estrada ||"); 
      System.out.println("||     <Introduzca su pin>     ||");
      if (intentos > 1) {
        System.out.println("||       Intento Numero:       ||");
        System.out.println("||             {" + intentos + "}             ||");
      }
      System.out.println("|||||||||||||||||||||||||||||||||");
      System.out.println("");

      for (int i = 0; i < claveCorrecta.length; i++) {
        System.out.print("     Introduzca el " + (i + 1) + " dígito: "); 
        clave[i] = sc.nextInt();
      }
      if (Arrays.toString(clave).equals(Arrays.toString(claveCorrecta))) {
        esCorrecto = true;
    
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        
        System.out.println("||||||||||||||||||||||||||||||||||"); 
        System.out.println("||        clave correcta        ||");
        System.out.println("||           Abriendo           ||");
        System.out.println("||||||||||||||||||||||||||||||||||");
      } else {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        System.out.println("|||||||||||||||||||||||||||||||||"); 
        System.out.println("||        clave errónea        ||");
        System.out.println("||         Reiniciando         ||");
        System.out.println("||             ⟳ ⟳             ||");
        System.out.println("|||||||||||||||||||||||||||||||||");

        intentos++;
        try {
          Thread.sleep(2000);
          System.out.print("\033[H\033[2J");  
          System.out.flush();  
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      }
    } while (intentos <= 4 && !esCorrecto);

    if (intentos >= 4) {
      System.out.println("||||||||||||||||||||||||||||||||||||"); 
      System.out.println("||                                ||");
      System.out.println("|| La caja fuerte se ha bloqueado ||");
      System.out.println("||                                ||");
      System.out.println("||||||||||||||||||||||||||||||||||||");
      System.out.println("");
    }
  }   
}
