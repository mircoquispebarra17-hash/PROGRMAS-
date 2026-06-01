public class OmitirMultiplos {
    public static void main(String[] args) {

        // Bucle del 1 al 50
        for (int i = 1; i <= 50; i++) {

            // Si es múltiplo de 5 → saltar
            if (i % 5 == 0) {
                continue;
            }

            // Mostrar número
            System.out.println(i);
        }
    }
}