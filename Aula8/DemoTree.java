public class DemoTree {
    public static void main(String[] args) {
        LinkedBinaryTree<String> T = new LinkedBinaryTree<>();

        Position<String> a = T.addRoot("A");          // raiz
        Position<String> b = T.addLeft(a,  "B");      // filho esquerdo
        Position<String> c = T.addRight(a, "C");      // filho direito
        Position<String> d = T.addLeft(b,  "D");      // neto

        /* Percurso pré-ordem via iterator() */
        System.out.print("Pré-ordem: ");
        for (String e : T) System.out.print(e + " ");   // A B D C
        System.out.println();

        System.out.println("Altura: " + T.height());    // 2 arestas
        System.out.println("Tamanho: " + T.size());     // 4 nós

        /* Exemplo de remoção de folha */
        T.removeLeaf(d);
        System.out.println("Após remover D, tamanho = " + T.size()); // 3
    }
}