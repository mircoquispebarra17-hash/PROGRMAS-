import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generar número aleatorio entre 1 y 100
        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int intento = 0;

        System.out.println("🎯 Adivina el número (entre 1 y 100)");

        // Bucle while hasta acertar
        while (intento != numeroSecreto) {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("🔼 Más alto");
            } else if (intento > numeroSecreto) {
                System.out.println("🔽 Más bajo");
            } else {
                System.out.println("✅ ¡Correcto! Adivinaste el número");
            }
        }

        scanner.close();
    }
}