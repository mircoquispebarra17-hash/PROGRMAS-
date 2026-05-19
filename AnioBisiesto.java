import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el año
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        // Verificar si es bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }

        scanner.close();
    }
}