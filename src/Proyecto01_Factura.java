import java.util.Scanner;

public class Proyecto01_Factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese la cantidad del producto: ");
        int cantidadProducto = scanner.nextInt();

        double subtotal = precioProducto * cantidadProducto;
        double igv = subtotal * 0.18; // Asumiendo un IGV del 18%
        double total = subtotal + igv;

        System.out.println("\nFactura:");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio unitario: " + precioProducto);
        System.out.println("Cantidad: " + cantidadProducto);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV (18%): " + igv);
        System.out.println("Total a pagar: " + total);
    }
}
