import java.util.Scanner;

public class EvaluacionTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los 3 lados
        System.out.print("Ingrese el lado 1: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el lado 2: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el lado 3: ");
        double c = scanner.nextDouble();

        // Verificar si forma triángulo
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Sí forman un triángulo");

            // Clasificación
            if (a == b && b == c) {
                System.out.println("Triángulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triángulo isósceles");
            } else {
                System.out.println("Triángulo escaleno");
            }

        } else {
            System.out.println("No forman un triángulo");
        }

        scanner.close();
    }
}
