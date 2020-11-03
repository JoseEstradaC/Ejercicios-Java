import javax.swing.text.StyledEditorKit;

public class Ejercicio23 {
  public static void main(String[] args) {

    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIva = System.console().readLine();

    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
    String codigoPromocional = System.console().readLine();

    double porcentajeIva;

    switch (tipoIva) {
      case "general":
        porcentajeIva = 21;
        break;
      case "reducido":
        porcentajeIva = 10;
        break;
      case "superreducido":
        porcentajeIva = 4;
        break;
    
      default:
        porcentajeIva = 21;
        break;
    }

    double cantidadIva = (porcentajeIva / 100) * baseImponible;
    double precioConIva = cantidadIva + baseImponible;



    double descuento = 0;

    switch (codigoPromocional) {
      case "mitad":
        descuento = (precioConIva / 2);
        
        break;
      case "meno5":
        descuento = 5;
        break;
      case "5porc":
        descuento = (precioConIva * 0.95);
        break;
      default:
        break;
    
    }
  
    System.out.printf("Base imponible      %8.2f€\n", baseImponible);
    System.out.printf("IVA (%4.2f%%)        %8.2f€\n", porcentajeIva, cantidadIva);
    System.out.printf("Precio con IVA      %8.2f€\n", precioConIva);
    if (!(descuento == 0)) {
      System.out.printf("Cód. promo.  (%s)%8.2f€\n", codigoPromocional, descuento);
    }

    double total = precioConIva - descuento;
    System.out.printf("TOTAL               %8.2f€\n", total);

  }
}
