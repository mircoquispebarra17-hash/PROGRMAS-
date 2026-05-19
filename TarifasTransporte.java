import java.util.Scanner;

public class TarifasTransporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese la distancia (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Tipo de usuario (estudiante, adulto, adulto_mayor): ");
        String tipo = scanner.next();

        System.out.print("Horario (normal, nocturno): ");
        String horario = scanner.next();

        // Tarifa base por km
        double tarifaBase = 2.0;
        double costo = distancia * tarifaBase;

        // Descuentos según tipo
        double descuento = 0;

        if (tipo.equalsIgnoreCase("estudiante")) {
            descuento = 0.30; // 30%
        } else if (tipo.equalsIgnoreCase("adulto_mayor")) {
            descuento = 0.50; // 50%
        } else if (tipo.equalsIgnoreCase("adulto")) {
            descuento = 0.0; // sin descuento
        }

        // Recargo por horario nocturno
        if (horario.equalsIgnoreCase("nocturno")) {
            costo = costo * 1.20; // aumenta 20%
        }

        // Aplicar descuento
        double total = costo - (costo * descuento);

        // Mostrar resultados
        System.out.println("Costo base: " + costo);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: " + total);

        scanner.close();
    }
}
