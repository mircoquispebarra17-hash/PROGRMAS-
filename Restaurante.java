import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion, subopcion;

        // Menú principal
        System.out.println("=== MENÚ DEL RESTAURANTE ===");
        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                // SUBMENÚ DESAYUNO
                System.out.println("\n--- DESAYUNO ---");
                System.out.println("1. Café + Pan");
                System.out.println("2. Jugo + Sandwich");
                System.out.print("Seleccione plato: ");
                subopcion = scanner.nextInt();

                switch (subopcion) {
                    case 1:
                        System.out.println("Plato: Café + Pan");
                        System.out.println("Precio: S/ 5");
                        break;
                    case 2:
                        System.out.println("Plato: Jugo + Sandwich");
                        System.out.println("Precio: S/ 8");
                        break;
                    default:
                        System.out.println("❌ Opción inválida");
                }
                break;

            case 2:
                // SUBMENÚ ALMUERZO
                System.out.println("\n--- ALMUERZO ---");
                System.out.println("1. Arroz con pollo");
                System.out.println("2. Lomo saltado");
                System.out.print("Seleccione plato: ");
                subopcion = scanner.nextInt();

                switch (subopcion) {
                    case 1:
                        System.out.println("Plato: Arroz con pollo");
                        System.out.println("Precio: S/ 12");
                        break;
                    case 2:
                        System.out.println("Plato: Lomo saltado");
                        System.out.println("Precio: S/ 15");
                        break;
                    default: 
                }