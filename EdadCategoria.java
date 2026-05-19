import java.util.Scanner;

public class EdadCategoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar edad
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        // Clasificación usando múltiples if
        if (edad >= 0 && edad <= 12) {
            System.out.println("Categoría: Niño");
        }

        if (edad >= 13 && edad <= 17) {
            System.out.println("Categoría: Adolescente");
        }

        if (edad >= 18 && edad <= 64) {
            System.out.println("Categoría: Adulto");
        }

        if (edad >= 65) {
            System.out.println("Categoría: Adulto mayor");
        }

        // Validación opcional
        if (edad < 0) {
            System.out.println("Edad no válida");
        }

        scanner.close();
    }
}