import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        long factorial = 1;

        // Ingreso del número
        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();

        // Validación
        if (numero < 0) {
            System.out.println("❌ No existe factorial para números negativos");
        } else {

            // Cálculo con for
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            // Resultado
            System.out.println("✅ El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}