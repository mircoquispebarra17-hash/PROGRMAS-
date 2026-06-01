public class NumerosImpares {
    public static void main(String[] args) {

        // Recorrer del 1 al 20
        for (int i = 1; i <= 20; i++) {

            // Si es par, saltar
            if (i % 2 == 0) {
                continue;
            }

            // Solo imprime impares
            System.out.println(i);
        }
    }
}