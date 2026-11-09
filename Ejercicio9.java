import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 25;
        int intento;
        int intentosRealizados = 0;

        do {
            System.out.print("Adivina el número secreto: ");
            intento = scanner.nextInt();
            intentosRealizados++;

            if (intento > numeroSecreto) {
                System.out.println("Muy alto");
            } else if (intento < numeroSecreto) {
                System.out.println("Muy bajo");
            } else {
                System.out.println("¡Correcto!");
            }
        } while (intento != numeroSecreto);

        System.out.println("Intentos realizados: " + intentosRealizados);
        scanner.close();
    }
}