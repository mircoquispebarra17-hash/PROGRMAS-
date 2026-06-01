import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String claveCorrecta = "1234";
        String claveIngresada = "";

        // Bucle while hasta que la contraseña sea correcta
        while (!claveIngresada.equals(claveCorrecta)) {
            System.out.print("Ingrese la contraseña: ");
            claveIngresada = scanner.nextLine();

            if (!claveIngresada.equals(claveCorrecta)) {
                System.out.println("❌ Contraseña incorrecta");
            }
        }

        System.out.println("✅ Acceso permitido");

        scanner.close();
    }
}