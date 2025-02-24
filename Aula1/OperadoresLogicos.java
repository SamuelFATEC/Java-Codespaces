public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operador lógico AND (equivalente ao "and" do Python)
        boolean eLogico = false && true; // false and true
        System.out.println("AND lógico: " + eLogico); // Saída: false

        // Operador lógico OR (equivalente ao "or" do Python)
        boolean ouLogico = false || false; // false or false
        System.out.println("OR lógico: " + ouLogico); // Saída: false

        // Operador lógico NOT (equivalente ao "not" do Python)
        boolean naoLogico = !false; // not false
        System.out.println("NOT lógico: " + naoLogico); // Saída: true
    }
}