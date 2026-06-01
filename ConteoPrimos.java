import java.util.Scanner;

public class ConteoPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio, fin;
        int contadorPrimos = 0;

        // Ingreso del rango
        System.out.print("Ingrese el inicio del rango: ");
        inicio = scanner.nextInt();

        System.out.print("Ingrese el fin del rango: ");
        fin = scanner.nextInt();

        // Recorrer el rango
        for (int i = inicio; i <= fin; i++) {

            if (i > 1) { // condición para números primos
                boolean esPrimo = true;

                // Verificar si es primo
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    contadorPrimos++;
                }
            }
        }

        // Resultado
        System.out.println("Cantidad de números primos: " + contadorPrimos);

        scanner.close();
    }
}