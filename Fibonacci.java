import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese la cantidad de términos: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        int contador = 0;

        System.out.println("Serie de Fibonacci:");

        // Generar serie con while
        while (contador < n) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;

            contador++;
        }

        scanner.close();
    }
}