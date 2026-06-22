import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double precio, total = 0;

        do {
            System.out.print("Precio (0 para terminar): ");
            precio = entrada.nextDouble();
            total += precio;
        } while (precio != 0);

        System.out.println("Total a pagar: " + total);
    }
}