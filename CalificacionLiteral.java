import java.util.Scanner;

public class CalificacionLiteral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de la letra
        System.out.print("Ingrese una calificación (A, B, C, D, F): ");
        char letra = scanner.next().toUpperCase().charAt(0);

        // Evaluación con switch
        switch (letra) {
            case 'A':
                System.out.println("✅ Excelente");
                break;

            case 'B':
                System.out.println("✅ Bueno");
                break;

            case 'C':
                System.out.println("⚠️ Regular");
                break;

            case 'D':
                System.out.println("❌ Deficiente");
                break;

            case 'F':
                System.out.println("❌ Reprobado");
                break;

            default:
                System.out.println("❌ Calificación inválida");
        }

        scanner.close();
    }
}