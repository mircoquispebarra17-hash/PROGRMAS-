import java.util.Scanner;

public class PromedioN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        double numero, suma = 0;

        // Ingreso de cantidad
        System.out.print("Ingrese la cantidad de números: ");
        n = scanner.nextInt();

        // Validación
        if (n <= 0) {
            System.out.println("❌ Cantidad inválida");
        } else {

            // Lectura de números
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese número " + i + ": ");
                numero = scanner.nextDouble();
                suma += numero;
            }

            // Cálculo del promedio
            double promedio = suma / n;
            System.out.println("✅ Promedio: " + promedio);
        }

        scanner.close();
    }
}