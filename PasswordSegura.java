import java.util.Scanner;

public class PasswordSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de contraseña
        System.out.print("Ingrese una contraseña: ");
        String password = scanner.nextLine();

        boolean tieneLongitud = password.length() >= 8;
        boolean tieneMayuscula = false;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;

        // Recorrer la cadena
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (!Character.isLetterOrDigit(c)) {
                tieneSimbolo = true;
            }
        }

        // Validaciones con mensajes específicos
        if (tieneLongitud && tieneMayuscula && tieneNumero && tieneSimbolo) {
            System.out.println("✅ Contraseña segura");
        } else {
            System.out.println("❌ La contraseña no cumple con:");

            if (!tieneLongitud) {
                System.out.println("- Mínimo 8 caracteres");
            }
            if (!tieneMayuscula) {
                System.out.println("- Al menos una mayúscula");
            }
            if (!tieneNumero) {
                System.out.println("- Al menos un número");
            }
            if (!tieneSimbolo) {
                System.out.println("- Al menos un símbolo");
            }
        }

        scanner.close();
    }
}