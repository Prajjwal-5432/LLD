package DesignPatterns.Behavioural.Strategy.After1;

public class PathCalculationStrategyFactory {
    public PathCalculationStrategy getPathCalculationStrategyForMode(TransportMode mode) {
        if(mode.equals(TransportMode.WALK)) {
            return new WalkPathCalculationStrategy();
        } else if(mode.equals(TransportMode.CAR)) {
            return new CarPathCalculationStrategy();
        } else if(mode.equals(TransportMode.BIKE)) {
            return new BikePathCalculationStrategy();
        }

        return null;
    }
}
