import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tipo;
        int horas;
        double tarifaPorHora = 0;
        double total;

        // Menú de vehículos
        System.out.println("=== TARIFA DE ESTACIONAMIENTO ===");
        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Camión");
        System.out.print("Seleccione tipo de vehículo: ");
        tipo = scanner.nextInt();

        // Selección de tarifa base con switch
        switch (tipo) {
            case 1:
                tarifaPorHora = 2.0;
                break;

            case 2:
                tarifaPorHora = 4.0;
                break;

            case 3:
                tarifaPorHora = 6.0;
                break;

            default:
                System.out.println("❌ Tipo de vehículo inválido");
                return;
        }

        // Ingreso de horas
        System.out.print("Ingrese número de horas: ");
        horas = scanner.nextInt();

        // Validación y cálculo con if
        if (horas <= 0) {
            System.out.println("❌ Número de horas inválido");
        } else {
            total = tarifaPorHora * horas;

            // Ejemplo de recargo adicional si supera 5 horas
            if (horas > 5) {
                total += total * 0.10; // 10% extra
            }

            System.out.println("Tarifa por hora: S/ " + tarifaPorHora);
            System.out.println("Total a pagar: S/ " + total);
        }

        scanner.close();
    }
}