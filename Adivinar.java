import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int secreto = 7;
        int intento;

        do {
            System.out.print("Adivina el número: ");
            intento = entrada.nextInt();
        } while (intento != secreto);

        System.out.println("Correcto!");
    }
}