import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int num = entrada.nextInt();

        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
