public class Main {
    public static void main(String[] args) {
        // Cria uma instância da árvore binária de pesquisa com Integer (chaves) e String (valores)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Insere elementos na árvore:
        map.put(50, "maçã");  // Inserir a chave 50 com valor "maçã"
        map.put(30, "banana"); // Inserir a chave 30 com valor "banana"
        map.put(70, "laranja"); // Inserir a chave 70 com valor "laranja"
        map.put(20, "kiwi");   // Inserir a chave 20 com valor "kiwi"
        map.put(40, "uva");    // Inserir a chave 40 com valor "uva"

        // Obtém o valor associado à chave 30:
        System.out.println("Valor da chave 30: " + map.get(30));

        // Encontra e imprime o Entry com a menor chave (mínimo):
        System.out.println("Valor mínimo: " + map.findMin());

        // Remove a chave 30:
        map.remove(30);

        // Imprime os elementos restantes em ordem:
        System.out.println("\nApós remover a chave 30:");
        map.inOrderTraversal();
    }
}