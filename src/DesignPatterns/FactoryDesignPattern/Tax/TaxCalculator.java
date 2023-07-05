package DesignPatterns.FactoryDesignPattern.Tax;

import DesignPatterns.FactoryDesignPattern.Tax.algorithm.TaxCalculatorFactory;

public class TaxCalculator {
    public static Double calculateTax(TaxRegime regime, SalaryDetails details) {
        return TaxCalculatorFactory
                    .getTaxAlgorithm(regime)
                    .calculateTax(details);
    }
}
