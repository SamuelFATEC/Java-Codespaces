public class FactorialTest {

    /**
     * Calcula o fatorial de n recursivamente.
     *
     * @param n inteiro não negativo
     * @return fatorial de n
     * @throws IllegalArgumentException se n for negativo
     */
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("O argumento deve ser não negativo.");
        }
        else if (n == 0) {
            return 1;  // caso base
        }
        else {
            return n * factorial(n - 1); // caso recursivo
        }
    }

    /**
     * Método principal para testar a função factorial.
     */
    public static void main(String[] args) {
        // Teste 1: Fatorial de 5
        int n1 = 5;
        int resultado1 = factorial(n1);
        System.out.println("factorial(" + n1 + ") = " + resultado1);

        // Teste 2: Fatorial de 0 (caso base)
        int n2 = 0;
        int resultado2 = factorial(n2);
        System.out.println("factorial(" + n2 + ") = " + resultado2);
    }
}