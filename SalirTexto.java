import java.util.Scanner;

public class SalirTexto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String texto;

        while (true) {
            System.out.print("Escribe algo: ");
            texto = entrada.nextLine();

            if (texto.equalsIgnoreCase("salir")) {
                break;
            }
        }

        System.out.println("Programa terminado");
    }
}