import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verifica a faixa etária
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade < 60) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}