import java.util.Scanner;

public class ContrasenaSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir contraseña (número)
        System.out.print("Ingrese una contraseña numérica: ");
        int contrasena = scanner.nextInt();

        // Validación
        if (contrasena > 1000 && contrasena < 9999) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña inválida");
        }

        scanner.close();
    }
}