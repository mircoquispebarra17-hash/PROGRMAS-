import java.util.Scanner;

public class ImpuestoProgresivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese su ingreso: ");
        double ingreso = scanner.nextDouble();

        double impuesto = 0;

        // Validación de entrada
        if (ingreso < 0) {
            System.out.println("Ingreso no válido");
        } else {
            // Cálculo por tramos
            if (ingreso <= 1000) {
                impuesto = ingreso * 0.05;
            } else if (ingreso <= 5000) {
                impuesto = ingreso * 0.10;
            } else {
                impuesto = ingreso * 0.20;
            }

            // Mostrar resultados
            System.out.println("Impuesto a pagar: " + impuesto);
            System.out.println("Ingreso neto: " + (ingreso - impuesto));
        }

        scanner.close();
    }
}