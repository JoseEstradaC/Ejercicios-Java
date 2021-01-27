package tema7;

import java.util.Scanner;

public class JuegoCazaTesoros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la altura del tablero: ");
    int y = Integer.parseInt(sc.nextLine());

    System.out.print("Introduzca la ancho del tablero: ");
    int x = Integer.parseInt(sc.nextLine());

    int[][] tablero = new int[y][x];
    final String[] equivalencia = { "O", "#", "X", "€" };

    int minaY = (int) (Math.random() * (y));
    int minaX = (int) (Math.random() * (x));

    tablero[minaY][minaX] = 2;

    System.out.println("Debug: Mina en: " + (minaY + 1) + " " + (minaX + 1));

    int teseroX;
    int tesoroY;

    do {
      tesoroY = (int) (Math.random() * (y));
      teseroX = (int) (Math.random() * (x));

    } while (teseroX == minaX && tesoroY == minaY);

    tablero[tesoroY][teseroX] = 3;

    System.out.println("Debug: Tesoro en: " + (tesoroY + 1) + " " + (teseroX + 1));

    boolean fin = false;
    boolean fallo = false;

    for (int i = 0; i < y; i++) {
      for (int j = 0; j < x; j++) {
        System.out.print(equivalencia[0]);
      }
      System.out.println("");
    }

    do {

      int casillaPulsadaY;
      do {
        System.out.print("Introduzca la Y: ");
        casillaPulsadaY = (Integer.parseInt(sc.nextLine()) - 1);
      } while (!(casillaPulsadaY >= 0 && casillaPulsadaY < y));

      int casillaPulsadaX;
      do {
        System.out.print("Introduzca la x: ");
        casillaPulsadaX = (Integer.parseInt(sc.nextLine()) - 1);
      } while (!(casillaPulsadaX >= 0 && casillaPulsadaX < x));

      switch (tablero[casillaPulsadaY][casillaPulsadaX]) {
        case 0:
          // pintamos de nuevo con la casilla pulsada, ponemos que esta pulsada
          tablero[casillaPulsadaY][casillaPulsadaX] = 1;

          break;
        case 1:
          // Casilla ya usada, no pintamos mensaje de error
          fallo = true;
          System.out.println("Esta casilla ya esta descubierta, pulsa otra");
          break;
        case 2:
          // Ganamos el juego pintamos todo
          System.out.println("Has perdido");
          fin = true;

          break;
        case 3:
          // Perdemos el juego pintamos todo
          System.out.println("Has ganado");
          fin = true;
          break;

        default:
          break;
      }

      if (!fallo) {
        for (int i = 0; i < y; i++) {
          for (int j = 0; j < x; j++) {

            if (fin) {
              System.out.print(equivalencia[tablero[i][j]]);
            } else {
              if (tablero[i][j] == 0 || tablero[i][j] > 1) {
                System.out.print(equivalencia[0]);
              } else if (tablero[i][j] == 1) {
                System.out.print(equivalencia[1]);
              }
            }
          }
          System.out.println("");
        }
      } else if (fallo) {
        fallo = false;
      }

    } while (!fin);

  }
}

// 2 3

//