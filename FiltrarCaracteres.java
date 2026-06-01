import java.util.Scanner;

public class FiltrarCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto;

        // Ingreso de cadena
        System.out.print("Ingrese una cadena: ");
        texto = scanner.nextLine();

        System.out.println("✅ Letras encontradas:");

        // Recorrer la cadena
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Si es número, saltar
            if (Character.isDigit(c)) {
                continue;
            }

            // Mostrar solo letras (o caracteres no numéricos)
            System.out.print(c);
        }

        scanner.close();
    }
}