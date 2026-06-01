import java.util.Scanner;

public class MayorMenorArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        // Cantidad de elementos
        System.out.print("Ingrese la cantidad de números: ");
        n = scanner.nextInt();

        int[] numeros = new int[n];

        // Ingreso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializar mayor y menor
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorrer el arreglo
        for (int i = 1; i < n; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar resultados
        System.out.println("✅ Mayor: " + mayor);
        System.out.println("✅ Menor: " + menor);

        scanner.close();
    }
}