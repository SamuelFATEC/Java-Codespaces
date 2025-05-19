public class HeapRealData{
    public static void main (String [] args){
        MinHeapPriorityQueue mhpq = new MinHeapPriorityQueue<>();
        Pair q1 = new Pair(2, "Tarefa 1");
        Pair q2 = new Pair(5, "Tarefa 2");
        Pair q3 = new Pair(1, "Tarefa 3");
        Pair q4 = new Pair(4, "Tarefa 4");
        Pair q5 = new Pair(3, "Tarefa 5");
        mhpq.insert(q1);
        mhpq.insert(q2);
        mhpq.insert(q3);
        mhpq.insert(q4);
        mhpq.insert(q5);
        System.out.println("Removendo as tarefas");
        while(mhpq.size()>2){
            System.out.println(mhpq.removeMin());
        }
    }
}