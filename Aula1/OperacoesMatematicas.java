public class OperacoesMatematicas {
    public static void main(String[] args) {
        // Soma (similar ao Python)
        int soma = 10 + 5;
        System.out.println("Soma: " + soma); // Saída: 15

        // Subtração (similar ao Python)
        int subtracao = 10 - 5;
        System.out.println("Subtração: " + subtracao); // Saída: 5

        // Multiplicação (similar ao Python)
        int multiplicacao = 10 * 5;
        System.out.println("Multiplicação: " + multiplicacao); // Saída: 50

        // Divisão (comportamento diferente em Java para inteiros)
        double divisao = 10 / 5; // Resultado é 2.0 (divisão de inteiros em Java resulta em double)
        System.out.println("Divisão: " + divisao); // Saída: 2.0

        // Divisão inteira (em Java, a divisão de inteiros já é inteira)
        int divisaoInteira = 10 / 3; // Resultado é 3 (descarta a parte decimal)
        System.out.println("Divisão inteira: " + divisaoInteira); // Saída: 3

        // Módulo (similar ao Python)
        int modulo = 11 % 3;
        System.out.println("Módulo: " + modulo); // Saída: 2

        // Exponenciação (Java não tem operador **, usa-se Math.pow)
        double exponenciacao = Math.pow(2, 4); // 2 elevado a 4
        System.out.println("Exponenciação: " + exponenciacao); // Saída: 16.0
    }
}