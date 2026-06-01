import java.util.Scanner;

public class SumaDigitosTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer número como texto
        System.out.print("Ingrese un número entero: ");
        String numero = scanner.next();

        int i = 0;
        int suma = 0;

        // Recorrer con while
        while (i < numero.length()) {
            char c = numero.charAt(i);

            // Verificar que sea dígito
            if (Character.isDigit(c)) {
                suma += c - '0'; // convertir char a número
            }

            i++;
        }

        // Mostrar resultado
        System.out.println("La suma de los dígitos es: " + suma);

        scanner.close();
    }
}
