package DesignPatterns.Behavioural.Observer;

public interface Subscriber<T> {
    void listen(Event event, T order);
}
