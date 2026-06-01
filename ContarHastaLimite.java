import java.util.Scanner;

public class ContarHastaLimite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limite;
        int suma = 0;

        // Ingreso del límite
        System.out.print("Ingrese el límite de suma: ");
        limite = scanner.nextInt();

        // Contar números
        for (int i = 1; ; i++) { // sin límite fijo

            suma += i;

            // Verificar si se supera el límite
            if (suma > limite) {
                System.out.println("⚠️ Se superó el límite con el número: " + i);
                break; // detener ciclo
            }

            System.out.println("Número: " + i + " | Suma acumulada: " + suma);
        }

        scanner.close();
    }
}
