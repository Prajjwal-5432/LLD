package DesignPatterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flipkart {
    private static Map<Event, List<Subscriber>> subscribers = new HashMap<>();
    public static void registerSubscriber(Event event, Subscriber subscriber) {
        if(!subscribers.containsKey(event)) {
            subscribers.put(event, new ArrayList<>());
        }

        subscribers.get(event).add(subscriber);
    }
    public void placeOrder(Order order) {
        notify(Event.ORDER_PLACED, order);
    }

    public void notify(Event event, Order order) {
        for(Subscriber subscriber: subscribers.get(event)) {
            subscriber.listen(event, order);
        }
    }
}
