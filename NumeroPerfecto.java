import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int suma = 0;

        // Ingreso del número
        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();

        // Calcular suma de divisores propios
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        // Verificar si es perfecto
        if (suma == numero && numero > 0) {
            System.out.println("✅ El número es perfecto");
        } else {
            System.out.println("❌ El número no es perfecto");
        }

        scanner.close();
    }
}
