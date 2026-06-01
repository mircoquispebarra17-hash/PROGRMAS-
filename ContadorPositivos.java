import java.util.Scanner;

public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int contador = 0;

        // Pedir números hasta que se ingrese 0
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = scanner.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                contador++;
            }

            System.out.print("Ingrese otro número (0 para terminar): ");
            numero = scanner.nextInt();
        }

        // Mostrar resultado
        System.out.println("Cantidad de números positivos: " + contador);

        scanner.close();
    }
}