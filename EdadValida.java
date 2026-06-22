import java.util.Scanner;

public class EdadValida {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int edad;

        do {
            System.out.print("Ingrese edad: ");
            edad = entrada.nextInt();
        } while (edad < 0 || edad > 120);

        System.out.println("Edad válida: " + edad);
    }
}