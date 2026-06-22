import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota, suma = 0;
        int count = 0;

        do {
            System.out.print("Ingrese nota (-1 para salir): ");
            nota = entrada.nextDouble();

            if (nota != -1) {
                suma += nota;
                count++;
            }

        } while (nota != -1);

        if (count > 0) {
            System.out.println("Promedio: " + (suma / count));
        }
    }
}
