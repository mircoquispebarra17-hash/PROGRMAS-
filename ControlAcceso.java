import java.util.Scanner;

public class ControlAcceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rol;

        // Ingreso de tipo de usuario
        System.out.print("Ingrese tipo de usuario (ADMIN, USER, GUEST): ");
        rol = scanner.next().toUpperCase();

        // Evaluación con switch
        switch (rol) {
            case "ADMIN":
                System.out.println("✅ Acceso total");
                break;

            case "USER":
                System.out.println("⚠️ Acceso parcial");
                break;

            case "GUEST":
                System.out.println("📖 Solo lectura");
                break;

            default:
                System.out.println("❌ Rol inválido");
        }

        scanner.close();
    }
}