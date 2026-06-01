import java.util.Scanner;

public class PrimerMultiplo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio, fin;

        // Ingreso del rango
        System.out.print("Ingrese el inicio del rango: ");
        inicio = scanner.nextInt();

        System.out.print("Ingrese el fin del rango: ");
        fin = scanner.nextInt();

        // Buscar el primer múltiplo de 7
        for (int i = inicio; i <= fin; i++) {

            if (i % 7 == 0) {
                System.out.println("✅ Primer múltiplo de 7 encontrado: " + i);
                break; // detener al encontrar el primero
            }
        }

        scanner.close();
    }
}
