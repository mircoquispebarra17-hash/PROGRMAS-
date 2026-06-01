import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double suma = 0;
        int contador = 0;

        System.out.println("Ingrese notas (-1 para terminar):");
        nota = scanner.nextDouble();

        // Bucle while
        while (nota != -1) {

            if (nota >= 0) {
                suma += nota;
                contador++;
            } else {
                System.out.println("❌ Nota inválida");
            }

            System.out.print("Ingrese otra nota: ");
            nota = scanner.nextDouble();
        }

        // Calcular promedio
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("✅ Promedio: " + promedio);
        } else {
            System.out.println("❌ No se ingresaron notas válidas");
        }

        scanner.close();
    }
}
}
}