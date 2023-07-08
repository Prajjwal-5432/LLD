package DesignPatterns.Behavioural.Strategy.Before;

public class GoogleMaps {
    public void findPath(String from, String to, TransportMode mode) {
        if(mode.equals(TransportMode.WALK)) {
            System.out.println("Finding Path for Walk");
        } else if(mode.equals(TransportMode.CAR)) {
            System.out.println("Finding Path for Car");
        } else {
            System.out.println("Finding Path for Bike");
        }
    }
}
