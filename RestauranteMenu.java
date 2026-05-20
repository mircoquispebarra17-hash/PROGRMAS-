import java.util.Scanner;

public class RestauranteMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion, subopcion;

        // Menú principal
        System.out.println("=== MENÚ RESTAURANTE ===");
        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                // Submenú Desayuno
                System.out.println("--- Desayuno ---");
                System.out.println("1. Café + Pan (S/ 5)");
                System.out.println("2. Jugo + Sandwich (S/ 8)");
                System.out.print("Seleccione plato: ");
                subopcion = scanner.nextInt();

                switch (subopcion) {
                    case 1:
                        System.out.println("Elegiste Café + Pan");
                        System.out.println("Precio: S/ 5");
                        break;
                    case 2:
                        System.out.println("Elegiste Jugo + Sandwich");
                        System.out.println("Precio: S/ 8");
                        break;
                    default:
                        System.out.println("❌ Opción inválida");
                }
                break;

            case 2:
                // Submenú Almuerzo
                System.out.println("--- Almuerzo ---");
                System.out.println("1. Arroz con pollo (S/ 12)");
                System.out.println("2. Lomo saltado (S/ 15)");
                System.out.print("Seleccione plato: ");
                subopcion = scanner.nextInt();

                switch (subopcion) {
                    case 1:
                        System.out.println("Elegiste Arroz con pollo");
                        System.out.println("Precio: S/ 12");
                        break;
                    case 2:
                        System.out.println("Elegiste Lomo saltado");
                        System.out.println("Precio: S/ 15");
                        break;
                    default:
                        System.out.println("❌ Opción inválida");
                }
                break;

            case 3:
                // Submenú Cena
                System.out.println("--- Cena ---");
                System.out.println("1. Ensalada (S/ 10)");
