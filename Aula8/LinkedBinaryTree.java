public class LinkedBinaryTree<E> extends AbstractTree<E>
                                 implements BinaryTree<E> {

    /* ---------- nó interno privado ---------- */
    protected static class Node<E> implements Position<E> {
        private E element;
        private Node<E> parent, left, right;
        Node(E e, Node<E> p, Node<E> l, Node<E> r) {
            element = e; parent = p; left = l; right = r;
        }
        /* implementação de Position */
        @Override public E getElement() { return element; }

        /* getters e setters package-private */
        Node<E> getParent()         { return parent; }
        Node<E> getLeft()           { return left; }
        Node<E> getRight()          { return right; }
        void setParent(Node<E> p)   { parent = p; }
        void setLeft(Node<E> l)     { left = l; }
        void setRight(Node<E> r)    { right = r; }
        void setElement(E e)        { element = e; }
    }

    /* ---------- campos da árvore ---------- */
    protected Node<E> root = null;
    private int size = 0;

    /* ---------- métodos de utilidade ---------- */
    protected Node<E> validate(Position<E> p) {
        if (!(p instanceof Node<?>))
            throw new IllegalArgumentException("Posição inválida");

        Node<E> node = (Node<E>) p;            // ② cast explícito
        if (node.getParent() == node)          // nó desactivado?
            throw new IllegalStateException("Posição não pertence mais à árvore");
        return node;
    }
    protected Position<E> makePosition(Node<E> node) {
        return (node == null) ? null : node;
    }

    /* ---------- implementação da interface ---------- */
    @Override public int size()           { return size; }
    @Override public boolean isEmpty()    { return size == 0; }
    @Override public Position<E> root()   { return makePosition(root); }

    @Override
    public Position<E> parent(Position<E> p) {
        Node<E> node = validate(p);
        return makePosition(node.getParent());
    }

    @Override
    public Position<E> left(Position<E> p) {
        Node<E> node = validate(p);
        return makePosition(node.getLeft());
    }

    @Override
    public Position<E> right(Position<E> p) {
        Node<E> node = validate(p);
        return makePosition(node.getRight());
    }

    /* ---------- operações de atualização (mutação) ---------- */
    public Position<E> addRoot(E e) {
        if (!isEmpty()) throw new IllegalStateException("Árvore já tem raiz");
        root = new Node<>(e, null, null, null);
        size = 1;
        return root;
    }

    public Position<E> addLeft(Position<E> p, E e) {
        Node<E> node = validate(p);
        if (node.getLeft() != null) throw new IllegalArgumentException("Filho esquerdo existe");
        Node<E> child = new Node<>(e, node, null, null);
        node.setLeft(child);
        size++;
        return child;
    }

    public Position<E> addRight(Position<E> p, E e) {
        Node<E> node = validate(p);
        if (node.getRight() != null) throw new IllegalArgumentException("Filho direito existe");
        Node<E> child = new Node<>(e, node, null, null);
        node.setRight(child);
        size++;
        return child;
    }

    /** Exemplo simples de remoção de folha; versões completas precisam lidar com + casos */
    public E removeLeaf(Position<E> p) {
        Node<E> node = validate(p);
        if (numChildren(p) > 0)
            throw new IllegalArgumentException("Não é folha");
        Node<E> parent = node.getParent();
        if (parent != null) {
            if (parent.getLeft() == node) parent.setLeft(null);
            else                          parent.setRight(null);
        } else {               // removendo a raiz
            root = null;
        }
        size--;
        node.setParent(node);  // marca como inválido
        return node.getElement();
    }
}