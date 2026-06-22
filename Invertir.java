import java.util.Scanner;

public class Invertir {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int num = entrada.nextInt();

        int invertido = 0;

        for (; num != 0; num /= 10) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
        }

        System.out.println("Invertido: " + invertido);
    }
}