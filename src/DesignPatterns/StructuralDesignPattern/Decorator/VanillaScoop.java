package DesignPatterns.StructuralDesignPattern.Decorator;

public class VanillaScoop implements IceCreamCone {
    private IceCreamCone iceCreamCone;
    public VanillaScoop(IceCreamCone iceCreamCone) {
        if(iceCreamCone == null) {
            throw new NullPointerException();
        }
        this.iceCreamCone = iceCreamCone;
    }
    @Override
    public int getCost() {
        return iceCreamCone.getCost() + 10;
    }

    @Override
    public String getConstituents() {
        return iceCreamCone.getConstituents() + ", Vanilla";
    }
}
