import java.util.Scanner;

public class SinEspacios {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese texto: ");
        String texto = entrada.nextLine();

        for (int i = 0; i < texto.length(); i++) {

            char c = texto.charAt(i);

            if (c == ' ') {
                continue;
            }

            System.out.print(c);
        }
    }
}