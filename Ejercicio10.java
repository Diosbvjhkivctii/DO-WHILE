import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double montoTotalVendido = 0;
        int cantidadTotalProductos = 0;
        int numeroVentas = 0;
        char continuar;

        do {
            System.out.print("Nombre del producto: ");
            String nombre = scanner.next();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Cantidad: ");
            int cantidad = scanner.nextInt();

            double subtotal = precio * cantidad;
            montoTotalVendido += subtotal;
            cantidadTotalProductos += cantidad;
            numeroVentas++;

            System.out.print("¿Desea registrar otro producto? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');

        double promedioVenta = numeroVentas > 0 ? montoTotalVendido / numeroVentas : 0;

        System.out.println("\n--- Resumen de Ventas ---");
        System.out.println("Monto total vendido: " + montoTotalVendido);
        System.out.println("Cantidad total de productos vendidos: " + cantidadTotalProductos);
        System.out.println("Promedio de venta por producto: " + promedioVenta);
        scanner.close();
    }
}