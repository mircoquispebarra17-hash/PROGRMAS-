import java.util.Scanner;

public class SumarPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.println("Ingrese números (0 para terminar):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            // Condición de salida
            if (numero == 0) {
                break;
            }

            // Si es negativo → ignorar
            if (numero < 0) {
                System.out.println("❌ Número negativo ignorado");
                continue;
            }

            // Sumar solo positivos
            suma += numero;
        }

        // Resultado
        System.out.println("✅ Suma de números positivos: " + suma);

        scanner.close();
    }
}