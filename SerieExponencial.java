import java.util.Scanner;

public class SerieExponencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, n;
        int suma = 1; // empieza con 1 (x^0 = 1)

        // Ingreso de datos
        System.out.print("Ingrese el valor de x: ");
        x = scanner.nextInt();

        System.out.print("Ingrese el valor de n: ");
        n = scanner.nextInt();

        // Calcular la serie con for
        for (int i = 1; i <= n; i++) {
            int potencia = (int) Math.pow(x, i);
            suma += potencia;
        }

        // Resultado
        System.out.println("Resultado de la serie: " + suma);

        scanner.close();
    }
}