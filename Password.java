import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String clave;

        do {
            System.out.print("Ingrese contraseña: ");
            clave = entrada.nextLine();
        } while (!clave.equals("1234"));

        System.out.println("Acceso permitido");
    }
}
