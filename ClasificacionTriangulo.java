import java.util.Scanner;

public class ClasificacionTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese el lado 1: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el lado 2: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el lado 3: ");
        double c = scanner.nextDouble();

        // Verificar si es válido
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("❌ Triángulo inválido (lados deben ser positivos)");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("❌ No forma un triángulo");
        } else {
            // Clasificación
            if (a == b && b == c) {
                System.out.println("✅ Triángulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("✅ Triángulo isósceles");
            } else {
                System.out.println("✅ Triángulo escaleno");
            }
        }

        scanner.close();
    }
}