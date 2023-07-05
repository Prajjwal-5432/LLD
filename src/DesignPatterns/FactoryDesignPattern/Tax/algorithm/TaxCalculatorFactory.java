package DesignPatterns.FactoryDesignPattern.Tax.algorithm;

import DesignPatterns.FactoryDesignPattern.Tax.TaxRegime;

public class TaxCalculatorFactory {
    public static TaxAlgorithm getTaxAlgorithm(TaxRegime regime) {
        switch (regime) {
            case OLD:
                return new OldTaxAlgorithm();
            case NEW:
                return new NewTaxAlgorithm();
        }

        throw new RuntimeException("Invalid Regime!");
    }
}
