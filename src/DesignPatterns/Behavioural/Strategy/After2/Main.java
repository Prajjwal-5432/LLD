package DesignPatterns.Behavioural.Strategy.After2;

public class Main {
    public static void main(String[] args) {
        PathCalculationStrategyRegistry pathCalculationStrategyRegistry = new PathCalculationStrategyRegistry();
        pathCalculationStrategyRegistry.register(TransportMode.CAR, new CarPathCalculationStrategy());
        pathCalculationStrategyRegistry.register(TransportMode.BIKE, new BikePathCalculationStrategy());
        pathCalculationStrategyRegistry.register(TransportMode.WALK, new WalkPathCalculationStrategy());

        GoogleMaps googleMaps = new GoogleMaps(pathCalculationStrategyRegistry);
    }
}
