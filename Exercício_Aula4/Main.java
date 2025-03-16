public class Main{
    public static void main(String [] args){
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.insertBetween(10, list.getHeader(), list.getTrailer());
        list.insertBetween(20, list.getNextNode(list.getHeader()), list.getTrailer());
        list.insertBetween(30, list.getNextNode(list.getNextNode(list.getHeader())), list.getTrailer());
        list.insertBetween(40, list.getNextNode(list.getNextNode(list.getNextNode(list.getHeader()))), list.getTrailer());

        System.out.println("Número de elementos: "+ list.size());

        list.printNodeElements();

        list.deleteNode(list.getNextNode(list.getNextNode(list.getHeader())));

        System.out.println("Número de elementos após a exclusão: "+ list.size());

        list.printNodeElements();

        System.out.println("A lista está vazia? "+ list.isEmpty());

        list.deleteNode(list.getNextNode(list.getHeader()));
        list.deleteNode(list.getNextNode(list.getHeader()));
        list.deleteNode(list.getNextNode(list.getHeader()));

        System.out.println("A lista está vazia após excluir todos os elementos? "+ list.isEmpty());

        list.insertBetween(40, list.getHeader(), list.getTrailer());
        list.insertBetween(50, list.getPrevTrailer(), list.getTrailer());

        System.out.println("Tamanho da lista: "+ list.size());

        list.printNodeElements();
    }   
}