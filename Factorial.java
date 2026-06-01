import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso del número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int i = 1;
        long factorial = 1;

        // Validación
        if (numero < 0) {
            System.out.println("❌ No existe factorial de número negativo");
        } else {
            // Cálculo con while
            while (i <= numero) {
                factorial *= i;
                i++;
            }

            // Resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}
