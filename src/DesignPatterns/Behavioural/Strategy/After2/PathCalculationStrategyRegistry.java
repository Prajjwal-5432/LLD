package DesignPatterns.Behavioural.Strategy.After2;

import java.util.HashMap;
import java.util.Map;

public class PathCalculationStrategyRegistry {
    private Map<TransportMode, PathCalculationStrategy> strategy = new HashMap<>();

    public void register(TransportMode mode, PathCalculationStrategy pathCalculationStrategy) {
        strategy.put(mode, pathCalculationStrategy);
    }

    public PathCalculationStrategy getPathCalculationStrategy(TransportMode mode) {
        return strategy.get(mode);
    }
}
