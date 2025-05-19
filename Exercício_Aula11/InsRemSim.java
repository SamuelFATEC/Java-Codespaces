import java.util.ArrayList;
public class InsRemSim{
    public static void main (String [] args){
        MinHeapPriorityQueue mhpq = new MinHeapPriorityQueue<>();
        Pair firstpair = new Pair(3, "C");
        Pair secondpair = new Pair (1, "A");
        Pair thirdpair = new Pair(2, "B");
        mhpq.insert(firstpair);
        mhpq.insert(secondpair);
        mhpq.insert(thirdpair);
        mhpq.removeMin();
        System.out.println(mhpq.peek());
        System.out.println(mhpq.size());
    }
}