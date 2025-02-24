import java.util.Scanner;
public class Exercicio3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para ter uma tabuada do 1 ao 10");

        int n;
        n = sc.nextInt();

        for(int i=1; i<11; i++){
            System.out.println(n*i);
        }
    }
}