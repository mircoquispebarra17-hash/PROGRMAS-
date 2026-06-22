import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;

        do {
            System.out.print("Ingrese un número positivo: ");
            num = entrada.nextInt();
        } while (num <= 0);

        System.out.println("Número válido: " + num);
    }
}