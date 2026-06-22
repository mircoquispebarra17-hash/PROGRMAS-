public class SumaFor {
    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            suma += i;
        }

        System.out.println("La suma total es: " + suma);
    }
}