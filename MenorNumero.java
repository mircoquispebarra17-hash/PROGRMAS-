import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int menor = Integer.MAX_VALUE; // valor inicial muy grande

        System.out.println("Ingrese números (0 para terminar):");
        numero = scanner.nextInt();

        // Bucle while
        while (numero != 0) {

            if (numero < menor) {
                menor = numero;
            }

            numero = scanner.nextInt();
        }

        // Resultado
        if (menor == Integer.MAX_VALUE) {
            System.out.println("❌ No se ingresaron números válidos");
        } else {
            System.out.println("✅ El menor número es: " + menor);
        }

        scanner.close();
    }
}