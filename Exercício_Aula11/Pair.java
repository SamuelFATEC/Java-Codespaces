public class Pair implements Comparable<Pair>{
    private int key;
    private String value;

    public Pair(int key, String value){
        this.key = key;
        this.value = value;
    }

    public int getKey(){
        return key;
    }

    public String getValue(){
        return value;
    }

    @Override

    public int compareTo(Pair other){
        return Integer.compare(this.key, other.key);
    }

    @Override

    public String toString(){
        return value;
    }
}