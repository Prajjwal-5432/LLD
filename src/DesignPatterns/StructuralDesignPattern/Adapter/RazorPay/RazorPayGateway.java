package DesignPatterns.StructuralDesignPattern.Adapter.RazorPay;

public class RazorPayGateway {
    public String payByCreditCard(String creditCard, String cvv, String expiry) {
        System.out.println("Payment done by razorpay");
        return "13";
    }

    public boolean checkPaymentStatus(String id) {
        return false;
    }
}
