import java.util.Scanner;

public class import java.util.Scanner;

public class ClasificacionNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Clasificación: positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Clasificación: par o impar
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        scanner.close();
    }
} {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Clasificación: positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Clasificación: par o impar
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        scanner.close();
    }
}