import java.util.Scanner;

public class DescuentoCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos
        System.out.print("Ingrese el monto de compra: ");
        double monto = scanner.nextDouble();

        System.out.print("Ingrese el tipo de cliente (VIP u otro): ");
        String tipo = scanner.next();

        double descuento = 0;

        // Evaluar condiciones
        if (monto > 500 && tipo.equalsIgnoreCase("VIP")) {
            descuento = 0.20;
        } else if (monto > 500) {
            descuento = 0.10;
        } else {
            descuento = 0;
        }

        // Calcular total
        double total = monto - (monto * descuento);

        // Mostrar resultados
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: " + total);

        scanner.close();
    }
}