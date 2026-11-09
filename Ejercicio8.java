import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Conversión de Temperaturas ---");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese temperatura en Celsius: ");
                double c = scanner.nextDouble();
                double f = (c * 9.0 / 5.0) + 32;
                System.out.println("Fahrenheit: " + f);
            } else if (opcion == 2) {
                System.out.print("Ingrese temperatura en Fahrenheit: ");
                double f = scanner.nextDouble();
                double c = (f - 32) * 5.0 / 9.0;
                System.out.println("Celsius: " + c);
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}