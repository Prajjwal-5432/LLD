package DesignPatterns.StructuralDesignPattern.Adapter;

import DesignPatterns.StructuralDesignPattern.Adapter.RazorPay.RazorPayGateway;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorPayPaymentGatewayAdapter());
    }
}
