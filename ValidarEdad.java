import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;

        while (true) {
            System.out.print("Ingrese su edad: ");
            edad = scanner.nextInt();

            // Si la edad es inválida
            if (edad < 0 || edad > 120) {
                System.out.println("❌ Edad inválida. Intente nuevamente.");
                continue; // vuelve al inicio del ciclo
            }

            // Si es válida
            System.out.println("✅ Edad válida: " + edad);
            break; // salir del ciclo
        }

        scanner.close();
    }
}
