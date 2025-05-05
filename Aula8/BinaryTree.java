public interface BinaryTree<E> extends Tree<E> {

    Position<E> left(Position<E> p);
    Position<E> right(Position<E> p);

    /* irmão: usa apenas interface pública */
    default Position<E> sibling(Position<E> p) {
        Position<E> parent = parent(p);
        if (parent == null) return null;
        if (p == left(parent)) return right(parent);
        else                    return left(parent);
    }

    /* filhos em ordem esquerda→direita */
    @Override
    default Iterable<Position<E>> children(Position<E> p) {
        java.util.List<Position<E>> list = new java.util.ArrayList<>(2);
        if (left(p)  != null) list.add(left(p));
        if (right(p) != null) list.add(right(p));
        return list;
    }

    @Override
    default int numChildren(Position<E> p) {
        int n = 0;
        if (left(p)  != null) n++;
        if (right(p) != null) n++;
        return n;
    }
}