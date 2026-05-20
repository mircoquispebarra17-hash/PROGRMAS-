import java.util.Scanner;

public class MesesAnio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mes;

        // Ingreso del número
        System.out.print("Ingrese un número del 1 al 12: ");
        mes = scanner.nextInt();

        // Evaluación con switch
        switch (mes) {
            case 1:
                System.out.println("Mes: Enero - 31 días");
                break;
            case 2:
                System.out.println("Mes: Febrero - 28 días");
                break;
            case 3:
                System.out.println("Mes: Marzo - 31 días");
                break;
            case 4:
                System.out.println("Mes: Abril - 30 días");
                break;
            case 5:
                System.out.println("Mes: Mayo - 31 días");
                break;
            case 6:
                System.out.println("Mes: Junio - 30 días");
                break;
            case 7:
                System.out.println("Mes: Julio - 31 días");
                break;
            case 8:
                System.out.println("Mes: Agosto - 31 días");
                break;
            case 9:
                System.out.println("Mes: Septiembre - 30 días");
                break;
            case 10:
                System.out.println("Mes: Octubre - 31 días");
                break;
            case 11:
                System.out.println("Mes: Noviembre - 30 días");
                break;
            case 12:
                System.out.println("Mes: Diciembre - 31 días");
                break;
            default:
                System.out.println("❌ Número inválido");
        }

        scanner.close();
    }
}

