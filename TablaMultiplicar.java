import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso del número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Mostrar tabla con for
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}