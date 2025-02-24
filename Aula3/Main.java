// Interface que define a estratégia de desconto
interface DiscountStrategy {
    double getDiscount(double amount);
}

// Estratégia padrão que não aplica desconto
class NoDiscount implements DiscountStrategy {
    @Override
    public double getDiscount(double amount) {
        return 0; // Sem desconto
    }
}

// Estratégia de desconto para clientes regulares
class RegularCustomerDiscount implements DiscountStrategy {
    @Override
    public double getDiscount(double amount) {
        return amount * 0.1; // 10% de desconto
    }
}

// Estratégia de desconto para clientes VIP
class VIPCustomerDiscount implements DiscountStrategy {
    @Override
    public double getDiscount(double amount) {
        return amount * 0.2; // 20% de desconto
    }
}

// Classe que utiliza a estratégia de desconto
class Billing {
    private DiscountStrategy discountStrategy;

    // Construtor que recebe a estratégia de desconto
    public Billing(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    // Método para calcular o valor final após o desconto
    public double calculateFinalAmount(double amount) {
        double discount = discountStrategy.getDiscount(amount);
        return amount - discount;
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        // Estratégia padrão (sem desconto)
        DiscountStrategy noDiscount = new NoDiscount();
        Billing billing = new Billing(noDiscount);
        System.out.println("Valor final (sem desconto): " + billing.calculateFinalAmount(100)); // Saída: 100.0

        // Estratégia de desconto para clientes regulares
        DiscountStrategy regularDiscount = new RegularCustomerDiscount();
        billing = new Billing(regularDiscount);
        System.out.println("Valor final (desconto regular): " + billing.calculateFinalAmount(100)); // Saída: 90.0

        // Estratégia de desconto para clientes VIP
        DiscountStrategy vipDiscount = new VIPCustomerDiscount();
        billing = new Billing(vipDiscount);
        System.out.println("Valor final (desconto VIP): " + billing.calculateFinalAmount(100)); // Saída: 80.0
    }
}