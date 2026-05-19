import java.util.Scanner;

public class LoginBloqueo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String claveCorrecta = "1234";

        String usuario, clave;
        int intentos = 0;
        boolean acceso = false;

        // Permitir máximo 3 intentos
        while (intentos < 3) {
            System.out.print("Ingrese usuario: ");
            usuario = scanner.next();

            System.out.print("Ingrese contraseña: ");
            clave = scanner.next();

            if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
                acceso = true;
                break;
            } else {
                intentos++;
                System.out.println("❌ Usuario o contraseña incorrectos");
            }
        }

        // Resultado final
        if (acceso) {
            System.out.println("✅ Acceso concedido");
        } else {
            System.out.println("🚫 Cuenta bloqueada por demasiados intentos");
        }

        scanner.close();
    }
}