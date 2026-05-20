import java.util.Scanner;

public class OperacionesLogicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operador;
        boolean valor1, valor2;
        boolean resultado = false;

        // Ingreso de datos
        System.out.print("Ingrese operador (AND, OR, XOR): ");
        operador = scanner.next().toUpperCase();

        System.out.print("Ingrese primer valor (true/false): ");
        valor1 = scanner.nextBoolean();

        System.out.print("Ingrese segundo valor (true/false): ");
        valor2 = scanner.nextBoolean();

        // Evaluación con switch
        switch (operador) {
            case "AND":
                resultado = valor1 && valor2;
                break;

            case "OR":
                resultado = valor1 || valor2;
                break;

            case "XOR":
                resultado = valor1 ^ valor2;
                break;

            default:
                System.out.println("❌ Operador inválido");
                scanner.close();
                return;
        }

        // Mostrar resultado
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}