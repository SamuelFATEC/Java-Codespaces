public class TesteNaoOrdenada {
    public static void main(String[] args) {
        ListaPrioridadeNaoOrdenada<String> fila = new ListaPrioridadeNaoOrdenada<>();

        fila.inserir(3, "Email comum");
        fila.inserir(1, "Alerta de segurança");
        fila.inserir(5, "Newsletter");
        fila.inserir(2, "Erro de sistema");

        while (!fila.estaVazia()) {
            System.out.println("Removido: " + fila.remover());
        }
    }
}