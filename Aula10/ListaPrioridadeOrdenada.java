import java.util.LinkedList;

public class ListaPrioridadeOrdenada<T> {
    private static class Entrada<T> {
        int prioridade;
        T valor;

        Entrada(int prioridade, T valor) {
            this.prioridade = prioridade;
            this.valor = valor;
        }
    }

    private LinkedList<Entrada<T>> lista;

    public ListaPrioridadeOrdenada() {
        lista = new LinkedList<>();
    }

    // Inserção mantém a lista ordenada (crescente por prioridade)
    public void inserir(int prioridade, T valor) {
        Entrada<T> nova = new Entrada<>(prioridade, valor);

        int i = 0;
        while (i < lista.size() && lista.get(i).prioridade <= prioridade) {
            i++;
        }
        lista.add(i, nova);
    }

    // Remove e retorna o primeiro elemento (maior prioridade = menor valor)
    public T remover() {
        if (lista.isEmpty()) return null;
        return lista.removeFirst().valor;
    }

    public boolean estaVazia() {
        return lista.isEmpty();
    }
}