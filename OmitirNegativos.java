public class OmitirNegativos {
    public static void main(String[] args) {

        int[] lista = {3, -2, 5, -7, 10};

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < 0) {
                continue;
            }
            System.out.println(lista[i]);
        }
    }
}