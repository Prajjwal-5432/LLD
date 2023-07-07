package DesignPatterns.StructuralDesignPattern.Adapter.PayU;

public class PayUPaymentGateway {
    public String makeCCPayment(Long creditCard, Long cvv, Long expiry) {
        return "123";
    }

    public PayUPaymentStatus checkPaymentStatus(Long id) {
        return PayUPaymentStatus.FAILURE;
    }
}
