public interface Tree<E> extends Iterable<E> {

    Position<E> root();
    Position<E> parent(Position<E> p);
    Iterable<Position<E>> children(Position<E> p);
    int numChildren(Position<E> p);

    int size();                     // nº de nós
    boolean isEmpty();

    /* utilidades típicas */
    default boolean isRoot(Position<E> p) { return p == root(); }
    default boolean isLeaf(Position<E> p) { return numChildren(p) == 0; }
}