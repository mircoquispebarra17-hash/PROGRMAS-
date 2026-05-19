import java.util.Scanner;

public class SistemaAcceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir usuario y contraseña
        System.out.print("Ingrese usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese contraseña: ");
        int contrasena = scanner.nextInt();

        // Validación
        if (usuario.equals("admin") && contrasena == 1234) {
            System.out.println("Acceso correcto");
        } else {
            System.out.println("Acceso denegado");
        }

        scanner.close();
    }
}