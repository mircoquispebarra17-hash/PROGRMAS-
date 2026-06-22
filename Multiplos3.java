import java.util.Scanner;

public class Multiplos3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int n = entrada.nextInt();

        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }

        System.out.println("Cantidad: " + contador);
    }
}