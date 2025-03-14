public class Main {
    public static void main(String[] args) {
        // Criando uma lista de inteiros
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        // Adicionando elementos no início
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        // Adicionando elementos no final
        list.addLast(40);
        list.addLast(50);

        // Exibindo o primeiro e o último elemento
        System.out.println("Primeiro elemento: " + list.first()); // 30
        System.out.println("Último elemento: " + list.last());    // 50

        // Removendo o primeiro elemento
        System.out.println("Elemento removido: " + list.removeFirst()); // 30

        // Exibindo o tamanho da lista
        System.out.println("Tamanho da lista: " + list.size()); // 4

        // Verificando se a lista está vazia
        System.out.println("A lista está vazia? " + list.isEmpty()); // false

        // Removendo todos os elementos
        while (!list.isEmpty()) {
            System.out.println("Removendo: " + list.removeFirst());
        }

        // Verificando se a lista está vazia após a remoção
        System.out.println("A lista está vazia? " + list.isEmpty()); // true
    }
}