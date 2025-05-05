public class PositionalList<E>{

    public interface Position<E>{

        E getElement() throws IllegalStateException;

    }

    private static class Node<E> implements Position<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n){
            element = e;
            prev = p;
            next = n;
        }

        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public Node<E> getPrev(){
            return prev;
        }
        public void setElement(E e){
            this.element = e;
        }
        public void setPrev(Node<E> p){
            this.prev = p;
        }
        public void setNext(Node<E> n){
            this.next = n;
        }
    }

    private Node<E> header = null;
    private Node<E> trailer = null;
    private int size = 0;

    public PositionalList(){
        header = new Node<>(null,null,null);
        trailer = new Node<>(null,header,null);
        header.setNext(trailer);
        trailer.setPrev(header);
        size = 0;
    }

    private Position<E> insertBetween(E e, Node<E> predecessor, Node<E> successor){
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
        return newest;
    }

    private Node<E> validate(Position<E> p) throws IllegalArgumentException{
        if(!(p instanceof Node)) throw new IllegalArgumentException("p é inválido");
        Node<E> node = (Node<E>)p;
        if(node.getNext() == null){
            throw new IllegalArgumentException("p não está na lista");
        }
        return node;
    }

    private Position<E> position(Node<E> node){
        if(node == header || node == trailer){
            return null;
        }
        return node;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Position<E> first(){
        return position(header.getNext());
    }
    
    public Position<E> last(){
        return position(trailer.getPrev());
    }

    public Position<E> before(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validate(p);
        return position(node.getPrev());
    }

    public Position<E> after(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validate(p);
        return position(node.getNext());
    }

    public Position<E> addFirst(E e){
        return insertBetween(e, header, header.getNext());
    }

    public Position<E> addLast(E e){
        return insertBetween(e, trailer.getPrev(), trailer);
    }

    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException{
        Node<E> node = validate(p);
        return insertBetween(e, node.getPrev(), node);
    }

    public Position<E> addAfter(Position<E> p , E e) throws IllegalArgumentException{
        Node<E> node = validate(p);
        return insertBetween(e, node, node.getNext());
    }

    public E replace(Position<E> p , E e) throws IllegalArgumentException{
        Node<E> node = validate(p);
        E answer = node.getElement();
        node.setElement(e);
        return answer;
    }

    public E delete(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validate(p);
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        E answer = node.getElement();
        node.setNext(null);
        node.setPrev(null);
        node.setElement(null);
        return answer;
    }

    public void printList(Position<E> p){
        Node<E> node = validate(p);
        while(node!=trailer){
            System.out.println(node.getElement());
            node = node.getNext();
        }
    }
}