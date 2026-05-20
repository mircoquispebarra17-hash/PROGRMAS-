import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        double valor, resultado;

        // Menú
        System.out.println("=== CONVERSOR DE UNIDADES ===");
        System.out.println("1. Metros a kilómetros");
        System.out.println("2. Kilómetros a metros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("4. Fahrenheit a Celsius");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        valor = scanner.nextDouble();

        switch (opcion) {

            case 1:
                resultado = valor / 1000;
                System.out.println("Resultado: " + resultado + " km");
                break;

            case 2:
                resultado = valor * 1000;
                System.out.println("Resultado: " + resultado + " m");
                break;

            case 3:
                resultado = (valor * 9/5) + 32;
                System.out.println("Resultado: " + resultado + " °F");
                break;

            case 4:
                resultado = (valor - 32) * 5/9;
                System.out.println("Resultado: " + resultado + " °C");
                break;

            default:
                System.out.println("❌ Opción no válida");
        }

        scanner.close();
    }
}