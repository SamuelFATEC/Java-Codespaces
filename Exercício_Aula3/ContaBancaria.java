import java.util.InputMismatchException;

public class ContaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;
    private String numeroConta;

    // Construtor
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicial
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        // Implemente aqui
        try{
            this.saldo = valor;
            return;
        }
        catch(InputMismatchException e){
            System.out.println("Digite somente números");
        }
        catch(ArithmeticException e){
            System.out.println("Somente é possível depositar valores positivos");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        // Implemente aqui
        try{
            if(this.saldo<=0 || valor>this.saldo){
                throw new ArithmeticException();
            }
            this.saldo = this.saldo-valor;
        }
        catch(ArithmeticException e){
            System.out.println("Erro: Saldo insuficiente para saque");
        }
        catch(InputMismatchException e){
            System.out.println("Digite somente números");
        }
    }

    // Método para consultar o saldo
    public double consultarSaldo() {
        // Implemente aqui
        return this.saldo;
    }

    // Método para exibir os dados da conta
    public String exibirDadosConta() {
        // Implemente aqui
        return String.format("Titular: %s \nNumero da conta bancária: %s \nSaldo: %.2f ", this.titular, this.numeroConta, this.saldo);
    }
}