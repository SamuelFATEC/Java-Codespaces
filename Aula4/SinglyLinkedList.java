public class SinglyLinkedList<E> {

    // Classe interna Node (nó)
    private static class Node<E> {
        private E element;      // Elemento armazenado no nó
        private Node<E> next;   // Referência para o próximo nó

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    // Atributos da lista
    private Node<E> head = null; // Primeiro nó da lista
    private Node<E> tail = null; // Último nó da lista
    private int size = 0;        // Tamanho da lista

    // Construtor
    public SinglyLinkedList() { }

    // Métodos de acesso
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    // Métodos de atualização
    public void addFirst(E e) {
        head = new Node<>(e, head); // Cria um novo nó e o define como head
        if (size == 0)
            tail = head; // Caso especial: lista estava vazia
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null); // Cria um novo nó
        if (isEmpty())
            head = newest; // Caso especial: lista estava vazia
        else
            tail.setNext(newest); // Liga o novo nó ao final da lista
        tail = newest; // Atualiza o tail para o novo nó
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null; // Lista vazia, nada para remover
        E answer = head.getElement();
        head = head.getNext(); // Atualiza o head para o próximo nó
        size--;
        if (size == 0)
            tail = null; // Caso especial: lista ficou vazia
        return answer;
    }
}