public class BinarySearch{
    public static boolean binarySearch(int [] array, int n){
        int first = 0;
        int last = array.length - 1;
        boolean found = false;
        while(first<=last && !found){
            int midpoint = (first+last)/2;
            if(array[midpoint] == n){
                found = true;
            }
            else{
                if(n<array[midpoint]){
                    last = midpoint - 1;
                }
                else{
                    first = midpoint + 1;
                }
            }
        }
        return found;
    }
    public static void main(String [] args){
        int [] lista_Exercício = {0, 3, 5, 9, 14, 17, 21, 33, 39};
        System.out.println(binarySearch(lista_Exercício, 15));
        System.out.println(binarySearch(lista_Exercício, 39));
    }
}