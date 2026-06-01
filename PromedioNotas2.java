import java.util.Scanner;

public class PromedioNotas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double suma = 0;
        int cantidad = 0;

        System.out.println("Ingrese notas (-1 para finalizar):");

        // Uso de do-while
        do {
            System.out.print("Nota: ");
            nota = scanner.nextDouble();

            if (nota >= 0) {
                suma += nota;
                cantidad++;
            } else if (nota != -1) {
                System.out.println("❌ Nota inválida");
            }

        } while (nota != -1);

        // Mostrar resultado
        if (cantidad > 0) {
            double promedio = suma / cantidad;
            System.out.println("✅ Promedio final: " + promedio);
            System.out.println("Cantidad de notas: " + cantidad);
        } else {
            System.out.println("❌ No se ingresaron notas válidas");
        }

        scanner.close();
    }
}