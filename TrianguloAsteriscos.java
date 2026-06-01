import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas;

        // Ingreso de datos
        System.out.print("Ingrese el número de filas: ");
        filas = scanner.nextInt();

        // Generar triángulo
        for (int i = 1; i <= filas; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // salto de línea
        }

        scanner.close();
    }
}
