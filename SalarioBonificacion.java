import java.util.Scanner;

public class SalarioBonificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos
        System.out.print("Ingrese el salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Ingrese los años de trabajo: ");
        int anios = scanner.nextInt();

        double bono = 0;

        // Evaluar condiciones
        if (anios > 5 && salario < 2000) {
            bono = salario * 0.20; // bono mayor (20%)
            System.out.println("Recibe bono alto");
        } else if (anios > 5 || salario < 2000) {
            bono = salario * 0.10; // bono menor (10%)
            System.out.println("Recibe bono menor");
        } else {
            bono = 0;
            System.out.println("No recibe bono");
        }

        // Total final
        double total = salario + bono;

        System.out.println("Bono: " + bono);
        System.out.println("Salario total: " + total);

        scanner.close();
    }
}