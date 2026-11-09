import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese número: ");
            numero = scanner.nextInt();
            if (numero > 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println("Suma total: " + suma);
        scanner.close();
    }
}