import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwordCorrecta = "Java2026";
        String password;

        do {
            System.out.print("Ingrese contraseña: ");
            password = scanner.next();
            if (!password.equals(passwordCorrecta)) {
                System.out.println("Contraseña incorrecta");
            }
        } while (!password.equals(passwordCorrecta));

        System.out.println("Acceso permitido");
        scanner.close();
    }
}