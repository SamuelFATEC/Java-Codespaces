public class SequentialSearch{
    public static boolean sequentialSearch(int [] array, int n){
        boolean found;
        found = false;
        for(int i=0; i<array.length; i++){
            if(array[i] == n){
                found = true;
            }
            else{
                found = false;
            }
        }
        return found;
    }
    public static void main(String [] args){
        int [] lista_Exercício = {0, 3, 5, 9, 14, 17, 21, 33, 39};
        System.out.println(sequentialSearch(lista_Exercício, 15));
        System.out.println(sequentialSearch(lista_Exercício, 39));
    }
}