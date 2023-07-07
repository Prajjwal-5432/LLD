package DesignPatterns.StructuralDesignPattern.Adapter;

import DesignPatterns.StructuralDesignPattern.Adapter.RazorPay.RazorPayGateway;

public class RazorPayPaymentGatewayAdapter implements PaymentGateway {
    RazorPayGateway razorPayGateway = new RazorPayGateway();
    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String CVV = String.valueOf(cvv);
        String expiry = String.valueOf(expiryMonth) + "/" + String.valueOf(expiryYear);
        String ans = razorPayGateway.payByCreditCard(cardNumber, CVV, expiry);

        return Long.parseLong(ans);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = razorPayGateway.checkPaymentStatus(String.valueOf(id));

        return status ? PaymentStatus.SUCCESS : PaymentStatus.FAILURE;
    }
}
