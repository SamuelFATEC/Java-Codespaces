public class TreeMap<K extends Comparable<K>, V> {
    // Classe interna Entry que armazena a chave (K) e o valor (V)
    public class Entry {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}

    // Classe interna Node que representa um nó da árvore, contendo uma Entry e ponteiros para filho esquerdo,
    // filho direito e pai.
    private class Node {
        Entry entry;
        Node left, right, parent;
        Node(Entry entry, Node parent) {
            this.entry = entry;
            this.parent = parent;
        }
    }
    // Variáveis de instância: raiz da árvore (inicialmente nula), tamanho da árvore.
    private Node root;
    private int size = 0;
    // Método para buscar uma chave na árvore
    public V get(K key) {
        Node node = subtreeSearch(root, key);
        return (node != null && node.entry.key.equals(key)) ? node.entry.value : null;
    }
    // Método para inserir um novo par de chave-valor na árvore
    public void put(K key, V value) {
        if (root == null) {  // Caso em que a árvore está vazia
            root = new Node(new Entry(key, value), null);
            size++;
            return;
        }
        Node node = subtreeSearch(root, key); // Encontrar o local para inserção
        if (key.equals(node.entry.key)) { // Atualizar valor se a chave já existe
            node.entry.value = value; // substitui
        } else {
            Node newNode = new Node(new Entry(key, value), node);
            if (key.compareTo(node.entry.key) < 0) node.left = newNode; // Inserir como filho esquerdo
            else node.right = newNode;  // Inserir como filho direito
            size++;
        }
    }
    // Método para remover uma chave da árvore
    public void remove(K key) {
        Node node = subtreeSearch(root, key);
        if (node == null || !node.entry.key.equals(key)) throw new IllegalArgumentException("Chave não encontrada");



        if (node.left != null && node.right != null) {  
            Node predecessor = subtreeMax(node.left);
            node.entry = predecessor.entry;
            node = predecessor;
        }

        Node child = (node.left != null) ? node.left : node.right;
        if (child != null) child.parent = node.parent;

        if (node == root) root = child;
        else if (node == node.parent.left) node.parent.left = child;
        else node.parent.right = child;

        size--;
    }
    // Método para encontrar um nó com uma determinada chave na árvore
    private Node subtreeSearch(Node node, K key) {
        if (node == null) return null;
        if (key.equals(node.entry.key)) return node;
        if (key.compareTo(node.entry.key) < 0) {
            return (node.left != null) ? subtreeSearch(node.left, key) : node;
        } else {
            return (node.right != null) ? subtreeSearch(node.right, key) : node;
        }
    }

    private Node subtreeMin(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }

    private Node subtreeMax(Node node) {
        while (node.right != null) node = node.right;
        return node;
    }

    public Entry findMin() {
        if (root == null) return null;
        return subtreeMin(root).entry;
    }

    public int size() {
        return size;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.entry.key + " => " + node.entry.value);
            inOrderTraversal(node.right);
        }
    }
}