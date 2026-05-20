import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000; // saldo inicial
        int opcion;

        do {
            // Mostrar menú
            System.out.println("\n=== MENÚ BANCARIO ===");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    // Depositar
                    System.out.print("Ingrese monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("❌ Monto inválido");
                    } else {
                        saldo += deposito;
                        System.out.println("✅ Depósito exitoso");
                    }
                    break;

                case 2:
                    // Retirar
                    System.out.print("Ingrese monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("❌ Monto inválido");
                    } else if (retiro > saldo) {
                        System.out.println("❌ Saldo insuficiente");
                    } else {
                        saldo -= retiro;
                        System.out.println("✅ Retiro exitoso");
                    }
                    break;

                case 3:
                    // Consultar saldo
                    System.out.println("💰 Saldo actual: " + saldo);
                    break;

                case 4:
                    // Salir
                    System.out.println("👋 Gracias por usar el sistema");
                    break;

                default:
                    System.out.println("❌ Opción no válida");
            }

        } while (opcion != 4);

        scanner.close();
    }
}