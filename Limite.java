public class Limite {
    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;

            if (suma > 200) {
                break;
            }
        }

        System.out.println("Suma acumulada: " + suma);
    }
}