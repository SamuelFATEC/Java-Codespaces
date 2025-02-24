public class Exercicio2{
    public static void main (String [] args){
        int [] tamanhos = {10, 100, 500, 1000 ,2000, 5000};

        System.out.printf("%-10s %-20s %-20s\n", "N", "Ordenado", "Invertido");
        for(int n: tamanhos) {
            int [] sortedArray = generateSortedArray(n);
            int [] invertedArray = generateInvertedArray(n);
            long timeSorted = measureInsertionSortTime(sortedArray);
            long timeInverted = measureInsertionSortTime(invertedArray);
            System.out.printf("%-10d %-20d %-20d\n", n, timeSorted, timeInverted);
        }
    }
    public static void insertionSort(int[] vet){
        for(int i=1; i<vet.length; i++){
            int chave = vet[i];
            int j = i - 1;

            while(j>=0 && vet[j]>chave){
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = chave;
        }
    }
    public static int[] generateSortedArray(int tam){
        int [] vet = new int[tam];
        for(int i=0; i<tam; i++){
            vet[i] = i;
        }
        return vet;
    }
    public static int[] generateInvertedArray(int tam){
        int [] vet = new int [tam];
        int j = tam-1;
        for(int i=0;i<tam;i++){
            vet[i] = j;
            j--;
        }
        return vet;
    }
    public static long measureInsertionSortTime(int[] vet){
        long start = System.nanoTime();
        insertionSort(vet);
        long end = System.nanoTime();
        return end - start;
    }
}