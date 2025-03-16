public class DoublyLinkedList <E>{

    private static class Node<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;
        
        public Node(E e, Node<E> p, Node<E> n ){
            element = e;
            prev = p;
            next = n;
        }
        
        public E getElement(){
            return element;
        }

        public Node<E> getPrev(){
            return prev;
        }

        public Node<E> getNext(){
            return next;
        }

        public void setPrev(Node<E> p){
            prev = p;
            return;
        }

        public void setNext(Node<E> n){
            next = n;
            return;
        }
    }

    private Node<E> header = null;
    private Node<E> trailer = null;
    private int size = 0;

    public DoublyLinkedList(){
        header = new Node<>(null,null,null);
        trailer = new Node<>(null,header,null);
        header.setNext(trailer);
        trailer.setPrev(header);
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Node<E> insertBetween(E e, Node<E> predecessor, Node<E> successor){
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
        return newest;
    }

    public E deleteNode(Node<E> node){
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        E element = node.getElement();
        node.setNext(null);
        node.setPrev(null);
        node.element = null;
        return element;
    }

    public Node<E> getHeader(){
        return header;
    }

    public Node<E> getTrailer(){
        return trailer;
    }

    public Node<E> getNextHeader(){
        return header.getNext();
    }

    public Node<E> getPrevHeader(){
        return header.getPrev();
    }

    public void setHeader(Node<E> e){
        header = e;
    }

    public E getHeaderElement(){
        return header.getElement();
    }

    public Node<E> getPrevTrailer(){
        return trailer.getPrev();
    }

    public Node<E> getNextNode(Node<E> node){
        return node.getNext();
    }

    public E getNodeElement(Node<E> node){
        return node.getElement();
    }

    public void printNodeElements(){
        Node<E> current = getNextHeader();
        while(current != trailer){
            System.out.println(current.getElement());
            current = getNextNode(current);
        }
    }
}