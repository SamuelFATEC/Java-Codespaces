public class Exercicio2 {

    public static int exercicio2(int n) {
        int a = 0;  // Inicialização de a, custo c1, executado 1 vez

        // Loop externo de i, custo c2, executado n vezes
        for (int i = 0; i < n; i++) {
            // Loop interno de j, custo c3, executado i vezes
            for (int j = 0; j < i; j++) {
                a += i + j;  // Soma de i e j a a, custo c4, executado i vezes para cada i
            }
        }
        return a;  // Retorno de a, custo c5, executado 1 vez
    }

    public static void main(String[] args) {
        int n = 5;  // Exemplo de valor para n
        int resultado = exercicio2(n);
        System.out.println("Resultado: " + resultado);
    }
}