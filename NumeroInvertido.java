import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int original = numero;
        int invertido = 0;

        // Trabajar con valor absoluto
        numero = Math.abs(numero);

        // Usar do-while (MEJOR OPCIÓN)
        do {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        } while (numero > 0);

        // Restaurar signo
        if (original < 0) {
            invertido = -invertido;
        }

        System.out.println("Número invertido: " + invertido);

        scanner.close();
    }
}
