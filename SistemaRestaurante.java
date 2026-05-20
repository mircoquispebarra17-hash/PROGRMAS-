import java.util.Scanner;

public class SistemaRestaurante {
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
                System.out.println("\n--- DESAYUNO ---");
                System.out.println("1. Café + Pan (S/ 5)");
                System.out.println("2. Jugo + Sandwich (S/ 8)");
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
                        System.out.println("❌ Plato inválido");
                }
                break;

            case 2:
                System.out.println("\n--- ALMUERZO ---");
                System.out.println("1. Arroz con pollo (S/ 12)");
                System.out.println("2. Lomo saltado (S/ 15)");
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
                        System.out.println("❌ Plato inválido");
                }
                break;

            case 3:
                System.out.println("\n--- CENA ---");
                System.out.println("1. Ensalada (S/ 10)");
                System.out.println("2. Pollo a la plancha (S/ 14)");
            }
        }
    }