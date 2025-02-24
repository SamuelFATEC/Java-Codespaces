public class Main {
    public static void main(String[] args) {
        // Criando uma conta bancária
        ContaBancaria conta = new ContaBancaria("João Silva", "12345-6");

        // Exibindo dados da conta
        System.out.println(conta.exibirDadosConta());

        // Depositando dinheiro
        conta.depositar(1000.0);
        System.out.println("Saldo após depósito: " + conta.consultarSaldo());

        // Sacando dinheiro
        conta.sacar(500.0);
        System.out.println("Saldo após saque: " + conta.consultarSaldo());

        // Tentando sacar mais do que o saldo disponível
        conta.sacar(600.0); // Deve exibir uma mensagem de erro

        // Exibindo dados atualizados da conta
        System.out.println(conta.exibirDadosConta());
    }
}