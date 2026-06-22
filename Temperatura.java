import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.print("Ingrese Celsius: ");
            double c = entrada.nextDouble();

            double f = (c * 9/5) + 32;
            System.out.println("Fahrenheit: " + f);

            System.out.print("¿Continuar? (1=si, 0=no): ");
            opcion = entrada.nextInt();

        } while (opcion == 1);
    }
}