public class BuscarNumero {
    public static void main(String[] args) {

        int[] numeros = {5, 8, 12, 20, 7};
        int buscar = 12;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                System.out.println("Encontrado en posición: " + i);
                break;
            }
        }
    }
}