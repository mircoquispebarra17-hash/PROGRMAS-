import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso del número
        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = scanner.nextInt();

        // Evaluación con switch agrupado
        switch (dia) {
            case 1:
                System.out.println("Día: Lunes");
                System.out.println("Tipo: Laborable");
                break;

            case 2:
                System.out.println("Día: Martes");
                System.out.println("Tipo: Laborable");
                break;

            case 3:
                System.out.println("Día: Miércoles");
                System.out.println("Tipo: Laborable");
                break;

            case 4:
                System.out.println("Día: Jueves");
                System.out.println("Tipo: Laborable");
                break;

            case 5:
                System.out.println("Día: Viernes");
                System.out.println("Tipo: Laborable");
                break;

            case 6:
            case 7:
                if (dia == 6) {
                    System.out.println("Día: Sábado");
                } else {
                    System.out.println("Día: Domingo");
                }
                System.out.println("Tipo: Fin de semana");
                break;

            default:
                System.out.println("❌ Número inválido");
        }

        scanner.close();
    }
}