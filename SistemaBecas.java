import java.util.Scanner;

public class SistemaBecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese su promedio: ");
        double promedio = scanner.nextDouble();

        System.out.print("¿Ingresos familiares bajos? (true/false): ");
        boolean ingresosBajos = scanner.nextBoolean();

        System.out.print("Ingrese número de cursos desaprobados: ");
        int cursosDesaprobados = scanner.nextInt();

        // Evaluación con condiciones combinadas y anidadas
        if (promedio >= 16) {

            if (ingresosBajos) {
                if (cursosDesaprobados == 0) {
                    System.out.println("✅ Beca completa");
                } else if (cursosDesaprobados <= 2) {
                    System.out.println("⚠️ Beca parcial");
                } else {
                    System.out.println("❌ No recibe beca (muchos cursos desaprobados)");
                }
            } else {
                // Buen promedio pero ingresos no bajos
                if (cursosDesaprobados == 0) {
                    System.out.println("⚠️ Beca parcial");
                } else {
                    System.out.println("❌ No recibe beca");
                }
            }

        } else {
            // Promedio bajo
            if (ingresosBajos && cursosDesaprobados == 0) {
                System.out.println("⚠️ Beca parcial");
            } else {
                System.out.println("❌ No recibe beca");
            }
        }

        scanner.close();
    }
}