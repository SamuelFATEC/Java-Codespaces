public abstract class AbstractTree<E> implements Tree<E> {

    /* profundidade em arestas */
    public int depth(Position<E> p) {
        return isRoot(p) ? 0 : 1 + depth(parent(p));
    }

    /* altura em arestas (versão recursiva) */
    public int height(Position<E> p) {
        int h = 0;
        for (Position<E> c : children(p))
            h = Math.max(h, 1 + height(c));
        return h;
    }

    /* altura da árvore inteira */
    public int height() {
        return isEmpty() ? 0 : height(root());
    }

    /* iteração por elementos em pré-ordem — simples mas útil */
    @Override
    public java.util.Iterator<E> iterator() {
        java.util.List<E> snapshot = new java.util.ArrayList<>();
        preorderSubtree(root(), snapshot);
        return snapshot.iterator();
    }
    private void preorderSubtree(Position<E> p, java.util.List<E> list) {
        if (p == null) return;
        list.add(p.getElement());
        for (Position<E> c : children(p))
            preorderSubtree(c, list);
    }
}