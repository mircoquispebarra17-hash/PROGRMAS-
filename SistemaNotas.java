import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar 3 notas
        System.out.print("Ingrese la nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = scanner.nextDouble();

        // Calcular promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio: " + promedio);

        // Evaluar resultado
        if (promedio >= 11) {
            System.out.println("Estado: Aprobado");
        } else if (promedio > 8 && promedio < 11) {
            System.out.println("Estado: Recuperación");
        } else {
            System.out.println("Estado: Desaprobado");
        }

        scanner.close();
    }
}