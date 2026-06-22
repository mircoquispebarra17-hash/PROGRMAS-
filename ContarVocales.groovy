import java.util.Scanner;
public class  {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = entrada.nextLine();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {

            char c = texto.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U') {

                contador++;
            }
        }

        System.out.println("Cantidad de vocales: " + contador);
    }
}