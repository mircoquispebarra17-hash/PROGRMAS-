import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = {5, 8, 12, 3, 9, 20};
        int buscado;
        boolean encontrado = false;

        // Mostrar arreglo
        System.out.println("Arreglo: 5, 8, 12, 3, 9, 20");

        // Número a buscar
        System.out.print("Ingrese el número a buscar: ");
        buscado = scanner.nextInt();

        // Búsqueda
        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == buscado) {
                System.out.println("✅ Número encontrado en la posición: " + i);
                encontrado = true;
                break; // detener búsqueda
            }
        }

        // Si no se encontró
        if (!encontrado) {
            System.out.println("❌ Número no encontrado");
        }

        scanner.close();
    }
}