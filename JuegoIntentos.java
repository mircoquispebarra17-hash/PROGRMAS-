import java.util.Scanner;

public class JuegoIntentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String claveCorrecta = "1234";
        String claveIngresada;

        int intentos = 0;
        int maxIntentos = 3;

        // Permitir máximo 3 intentos
        while (intentos < maxIntentos) {
            System.out.print("Ingrese la clave: ");
            claveIngresada = scanner.nextLine();

            if (claveIngresada.equals(claveCorrecta)) {
                System.out.println("✅ Acceso permitido");
                break; // salir si acierta
            } else {
                intentos++;
                System.out.println("❌ Clave incorrecta. Intentos restantes: " + (maxIntentos - intentos));
            }
        }

        // Si agotó intentos
        if (intentos == maxIntentos) {
            System.out.println("🚫 Acceso bloqueado");
        }

        scanner.close();
    }
}