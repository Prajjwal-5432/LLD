package DesignPatterns.Behavioural.Strategy.After2;

public class GoogleMaps {
    private PathCalculationStrategyRegistry pathCalculationStrategyRegistry;
    public GoogleMaps(PathCalculationStrategyRegistry pathCalculationStrategyRegistry) {
        this.pathCalculationStrategyRegistry = pathCalculationStrategyRegistry;
    }
    public void findPath(String from, String to, TransportMode mode) {
        PathCalculationStrategy pathCalculationStrategy =
                pathCalculationStrategyRegistry.getPathCalculationStrategy(mode);

        pathCalculationStrategy.calculatePath(from, to);
    }
}
