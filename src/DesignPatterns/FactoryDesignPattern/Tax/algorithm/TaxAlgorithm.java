package DesignPatterns.FactoryDesignPattern.Tax.algorithm;

import DesignPatterns.FactoryDesignPattern.Tax.SalaryDetails;

public interface TaxAlgorithm {
    Double calculateTax(SalaryDetails details);
}
