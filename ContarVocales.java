import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto;
        int contador = 0;

        // Ingreso de texto
        System.out.print("Ingrese una cadena: ");
        texto = scanner.nextLine();

        // Convertir a minúsculas
        texto = texto.toLowerCase();

        // Recorrer la cadena
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        // Resultado
        System.out.println("✅ Cantidad de vocales: " + contador);

        scanner.close();
    }
}
