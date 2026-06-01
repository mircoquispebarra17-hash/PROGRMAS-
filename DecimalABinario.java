import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer número decimal
        System.out.print("Ingrese un número decimal: ");
        int numero = scanner.nextInt();

        int original = numero;
        String binario = "";

        // Caso especial
        if (numero == 0) {
            binario = "0";
        } else {
            // Conversión con while
            while (numero > 0) {
                int residuo = numero % 2;      // obtener residuo
                binario = residuo + binario;   // agregar al inicio
                numero = numero / 2;           // dividir entre 2
            }
        }

        // Mostrar resultado
        System.out.println("El número " + original + " en binario es: " + binario);

        scanner.close();
    }
}
