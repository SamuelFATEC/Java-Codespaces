import java.util.Scanner;
public class Exercicio2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10");

        float nota;
        nota = sc.nextFloat();
        
        if(nota>=7){
            System.out.println("Aprovado");
        }
        else if(nota>5 && nota<7){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}