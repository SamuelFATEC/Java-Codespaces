import java.util.Stack;

public class DelimiterMatching {

    /** Método fornecido para testar delimitadores */
    public static boolean isMatched(String expression) {
        final String opening = "({[";
        final String closing = ")}]";
        Stack<Character> buffer = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (opening.indexOf(c) != -1) { // abre delimitador
                buffer.push(c);
            } else if (closing.indexOf(c) != -1) { // fecha delimitador
                if (buffer.isEmpty()) {
                    return false; // não há delimitador para combinar
                }
                if (closing.indexOf(c) != opening.indexOf(buffer.pop())) {
                    return false; // delimitadores não combinam
                }
            }
        }
        return buffer.isEmpty(); // verifica se todos delimitadores foram combinados
    }

    /** Método main para testes rápidos */
    public static void main(String[] args) {
        String[] tests = {
            "( )(( )){([( )])}",    // verdadeiro
            "((( )(( )){([( )])}))",// verdadeiro
            ")(",                   // falso
            "({[)]}",               // falso
            "((())",                // falso
            "([]{})",               // verdadeiro
            "[(])",                 // falso
            "",                     // verdadeiro (não há delimitadores, portanto, ok)
            "{[()]}",               // verdadeiro
        };

        for (String test : tests) {
            System.out.printf("Expressão: %-20s Resultado: %b\n", test, isMatched(test));
        }
    }
}