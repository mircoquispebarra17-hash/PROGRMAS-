import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            System.out.print("Elija: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola!");
                    break;
                case 2:
                    System.out.println("Adiós!");
                    break;
            }

        } while (opcion != 3);
    }
}