import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base: ");
        int base = scanner.nextInt();
        System.out.print("Exponente: ");
        int exponente = scanner.nextInt();

        long resultado = 1;
        int contador = 0;

        do {
            if (exponente > 0) {
                resultado *= base;
            }
            contador++;
        } while (contador < exponente);

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}