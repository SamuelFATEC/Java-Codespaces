import java.util.ArrayList;
import java.util.List;

public class ListaPrioridadeNaoOrdenada<T> {
    private static class Entrada<T> {
        int prioridade;
        T valor;

        Entrada(int prioridade, T valor) {
            this.prioridade = prioridade;
            this.valor = valor;
        }
    }

    private List<Entrada<T>> lista;

    public ListaPrioridadeNaoOrdenada() {
        lista = new ArrayList<>();
    }

    // Inserção rápida: apenas adiciona no final da lista
    public void inserir(int prioridade, T valor) {
        lista.add(new Entrada<>(prioridade, valor));
    }

    // Remove e retorna o elemento de maior prioridade (menor valor)
    public T remover() {
        if (lista.isEmpty()) return null;

        int idxMaior = 0;
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).prioridade < lista.get(idxMaior).prioridade) {
                idxMaior = i;
            }
        }

        return lista.remove(idxMaior).valor;
    }

    public boolean estaVazia() {
        return lista.isEmpty();
    }
}
