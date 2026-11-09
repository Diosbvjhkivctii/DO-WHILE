import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaTotal = 0;
        int cantidadNotas = 0;
        char continuar;

        do {
            double nota;
            do {
                System.out.print("Nota (0-20): ");
                nota = scanner.nextDouble();
            } while (nota < 0 || nota > 20);

            sumaTotal += nota;
            cantidadNotas++;

            System.out.print("¿Continuar? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');

        double promedio = cantidadNotas > 0 ? sumaTotal / cantidadNotas : 0;

        System.out.println("Cantidad de notas: " + cantidadNotas);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Promedio: " + promedio);
        scanner.close();
    }
}