import java.util.Scanner;

public class PalabrasLargas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese texto: ");
        String texto = entrada.nextLine();

        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() < 3) {
                continue;
            }

            System.out.println(palabras[i]);
        }
    }
}