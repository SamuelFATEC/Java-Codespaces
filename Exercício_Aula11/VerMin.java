import java.util.ArrayList;
public class VerMin{
    public static void main(String [] args){
        MinHeapPriorityQueue mhpq = new MinHeapPriorityQueue<>();
        Pair fp = new Pair(10, "Z");
        mhpq.insert(fp);
        System.out.println(mhpq.peek());
        Pair sp = new Pair(5, "Y");
        mhpq.insert(sp);
        System.out.println(mhpq.peek());
        Pair tp = new Pair(1, "X");
        mhpq.insert(tp);
        System.out.println(mhpq.peek());
        Pair fourthp = new Pair(7, "W");
        mhpq.insert(fourthp);
        System.out.println(mhpq.peek());
        Pair fifthp = new Pair(3, "V");
        mhpq.insert(fifthp);
        System.out.println(mhpq.peek());
    }
}