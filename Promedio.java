import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Cantidad: ");
        int n = entrada.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            suma += entrada.nextDouble();
        }

        double promedio = suma / n;

        System.out.println("Promedio: " + promedio);
    }
}