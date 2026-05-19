import java.util.Scanner;

public class CajeroATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pinCorrecto = 1234;
        int intentos = 0;
        int pinIngresado;
        double saldo = 2000; // saldo inicial
        double limiteDiario = 1000; // límite de retiro

        boolean acceso = false;

        // Validación de PIN (máx 3 intentos)
        while (intentos < 3) {
            System.out.print("Ingrese su PIN: ");
            pinIngresado = scanner.nextInt();

            if (pinIngresado == pinCorrecto) {
                acceso = true;
                break;
            } else {
                intentos++;
                System.out.println("PIN incorrecto");
            }
        }

        if (!acceso) {
            System.out.println("Cuenta bloqueada por 3 intentos fallidos");
        } else {
            // Menú simple
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Su saldo es: " + saldo);

            } else if (opcion == 2) {
                System.out.print("Ingrese monto a retirar: ");
                double retiro = scanner.nextDouble();

                if (retiro > limiteDiario) {
                    System.out.println("Excede el límite diario");
                } else if (retiro > saldo) {
                    System.out.println("Fondos insuficientes");
                } else {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso");
                    System.out.println("Saldo restante: " + saldo);
                }

            } else {
                System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}