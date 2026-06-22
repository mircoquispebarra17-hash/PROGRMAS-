import java.util.Scanner;

public class Intentos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num, intentos = 0;

        do {
            System.out.print("Ingrese número positivo: ");
            num = entrada.nextInt();
            intentos++;
        } while (num <= 0);

        System.out.println("Intentos: " + intentos);
    }
}