public class SumaPares {
    public static void main(String[] args) {

        int suma = 0;

        // Recorrer del 1 al 100
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) { // verificar si es par
                suma += i;
            }
        }

        // Mostrar resultado
        System.out.println("La suma de los números pares del 1 al 100 es: " + suma);
    }
}