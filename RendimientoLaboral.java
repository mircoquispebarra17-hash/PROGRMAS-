import java.util.Scanner;

public class RendimientoLaboral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos (calificaciones de 0 a 10)
        System.out.print("Ingrese puntualidad (0-10): ");
        int puntualidad = scanner.nextInt();

        System.out.print("Ingrese productividad (0-10): ");
        int productividad = scanner.nextInt();

        System.out.print("Ingrese cumplimiento (0-10): ");
        int cumplimiento = scanner.nextInt();

        // Calcular promedio
        double promedio = (puntualidad + productividad + cumplimiento) / 3.0;

        System.out.println("Promedio: " + promedio);

        // Clasificación
        if (promedio >= 9) {
            System.out.println("✅ Rendimiento: Excelente");
        } else if (promedio >= 7) {
            System.out.println("✅ Rendimiento: Bueno");
        } else if (promedio >= 5) {
            System.out.println("⚠️ Rendimiento: Regular");
        } else {
            System.out.println("❌ Rendimiento: Deficiente");
        }

        scanner.close();
    }
}