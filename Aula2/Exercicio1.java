public class Exercicio1 {

    public static int exercicio1(int n) {
        int i = 0;  // Inicialização de i, custo c1, executado 1 vez
        int a = 0;  // Inicialização de a, custo c2, executado 1 vez

        // Loop while, custo c3, número de execuções é aproximadamente n/2
        while (i < n) {
            a += i;  // Incremento de a com i, custo c4, executado n/2 vezes
            i += 2;  // Incremento de i por 2, custo c5, executado n/2 vezes
        }
        return a;  // Retorno de a, custo c6, executado 1 vez
    }

    public static void main(String[] args) {
        int n = 10;  // Exemplo de valor para n
        int resultado = exercicio1(n);
        System.out.println("Resultado: " + resultado);
    }
}