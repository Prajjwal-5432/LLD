package DesignPatterns.FactoryDesignPattern.Tax.algorithm;

import DesignPatterns.FactoryDesignPattern.Tax.SalaryDetails;

public class OldTaxAlgorithm implements TaxAlgorithm{
    @Override
    public Double calculateTax(SalaryDetails details) {
        return 0.4 * details.getBasePay() + 0.3 * details.getHra();
    }
}
