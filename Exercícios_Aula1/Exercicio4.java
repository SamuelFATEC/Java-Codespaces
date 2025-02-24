import java.util.Scanner;
public class Exercicio4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double altura;

        System.out.println("Digite seu nome: ");
        nome=sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade=sc.nextInt();

        System.out.println("Digite sua altura: ");
        altura=sc.nextDouble();

        System.out.printf("Nome: "+nome+"\nIdade: "+idade+"\nAltura: %.2f\n", altura);
    }
}