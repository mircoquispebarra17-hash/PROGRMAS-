import java.util.Scanner;

public class SumaHastaCero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num, suma = 0;

        do {
            System.out.print("Ingrese número: ");
            num = entrada.nextInt();
            suma += num;
        } while (num != 0);

        System.out.println("Suma total: " + suma);
    }
}
