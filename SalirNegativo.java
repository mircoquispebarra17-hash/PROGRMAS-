import java.util.Scanner;

public class SalirNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese números (se detiene con negativos):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            // Si es negativo → salir del ciclo
            if (numero < 0) {
                System.out.println("❌ Número negativo detectado. Programa finalizado.");
                break; // rompe el while
            }

            System.out.println("Número ingresado: " + numero);
        }

        scanner.close();
    }
}
