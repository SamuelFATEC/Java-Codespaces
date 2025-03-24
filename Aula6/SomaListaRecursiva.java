public class SomaListaRecursiva {

    // Método recursivo que soma todos os elementos do array
    public static int somaLista(int[] numeros) {
        // Caso base: se só há um elemento no array, retorne-o
        if (numeros.length == 1) {
            return numeros[0];
        } else {
            // Cria um novo array a partir do segundo elemento em diante
            int[] restante = new int[numeros.length - 1];
            System.arraycopy(numeros, 1, restante, 0, numeros.length - 1);

            // Retorna o primeiro elemento + soma do restante do array
            return numeros[0] + somaLista(restante);
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9};
        System.out.println(somaLista(numeros)); // Deve imprimir 25
    }
}