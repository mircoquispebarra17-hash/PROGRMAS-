import java.util.Scanner;

public class EvaluadorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso del número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Par o impar
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        // Múltiplos
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Es múltiplo de 3 y 5");
        } else if (numero % 3 == 0) {
            System.out.println("Es múltiplo de 3");
        } else if (numero % 5 == 0) {
            System.out.println("Es múltiplo de 5");
        } else {
            System.out.println("No es múltiplo de 3 ni de 5");
        }

        scanner.close();
    }
}