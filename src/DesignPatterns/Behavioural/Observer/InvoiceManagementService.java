package DesignPatterns.Behavioural.Observer;

public class InvoiceManagementService implements Subscriber<Order> {
    public InvoiceManagementService() {
        Flipkart.registerSubscriber(Event.ORDER_PLACED, this);
    }
    public void listen(Event event, Order order) {
        generateInvoice(order);
    }

    public void generateInvoice(Order order) {
        System.out.println("Generating order of amount " + order.getAmount());
    }
}
