import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    // Método para dividir dois números
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita ao usuário os valores de entrada
            System.out.print("Digite o primeiro número (a): ");
            double a = scanner.nextDouble();

            System.out.print("Digite o segundo número (b): ");
            double b = scanner.nextDouble();

            // Realiza a divisão
            double result = calculator.divide(a, b);
            System.out.println("Resultado da divisão: " + result);

        } catch (InputMismatchException e) {
            // Captura exceção se a entrada não for um número válido
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar números.");
        } catch (ArithmeticException e) {
            // Captura exceção de divisão por zero
            System.out.println(e.getMessage());
        } finally {
            // Fecha o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
}