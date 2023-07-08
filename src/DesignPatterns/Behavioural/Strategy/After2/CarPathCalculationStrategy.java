package DesignPatterns.Behavioural.Strategy.After2;

public class CarPathCalculationStrategy implements PathCalculationStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Finding Path for Car");
    }
}
