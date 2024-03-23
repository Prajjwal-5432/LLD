package DesignPatterns.StructuralDesignPattern.Decorator;


public class Customer {
    public static void main(String[] args) {
        IceCreamCone iceCreamCone = new VanillaScoop(
                                        new ChocolateScoop(
                                            new VanillaScoop(
                                                new OrangeCone()
                                            )
                                        )
                                    );


        System.out.println(iceCreamCone.getCost());
        System.out.println(iceCreamCone.getConstituents());

//        IceCreamCone chocoBar = new ChocolateScoop(new ChocolateScoop(new BlueCone()));
//        IceCreamCone kesarPista = new VanillaScoop(new BlueCone());
//
//        IceCreamCone chocoBarwithVanilla = new VanillaScoop(chocoBar);
//        System.out.println(chocoBarwithVanilla.getCost());
//        System.out.println(chocoBarwithVanilla.getConstituents());

        //Pizza
        //Coffee Machine
        //decorator is better than inheritance because
        //using decorator we can decorate in any order
    }
}
