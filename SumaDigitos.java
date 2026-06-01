import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer número
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int suma = 0;

        // Convertir a positivo (por si es negativo)
        if (numero < 0) {
            numero = -numero;
        }

        // Proceso con while
        while (numero > 0) {
            int digito = numero % 10; // obtener último dígito
            suma += digito;          // acumular
            numero = numero / 10;    // eliminar último dígito
        }

        // Mostrar resultado
        System.out.println("La suma de los dígitos es: " + suma);

        scanner.close();
    }
}
