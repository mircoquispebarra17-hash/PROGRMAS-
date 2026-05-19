import java.util.Scanner;

public class RiesgoCrediticio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese su ingreso mensual: ");
        double ingreso = scanner.nextDouble();

        System.out.print("Ingrese su historial crediticio (bueno, regular, malo): ");
        String historial = scanner.next();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Evaluación del riesgo
        if (ingreso >= 3000 && historial.equalsIgnoreCase("bueno") && edad >= 25) {
            System.out.println("Riesgo: Bajo ✅");
        } else if (ingreso >= 1500 && historial.equalsIgnoreCase("regular")) {
            System.out.println("Riesgo: Medio ⚠️");
        } else {
            System.out.println("Riesgo: Alto ❌");
        }

        scanner.close();
    }
}