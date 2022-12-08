package com.codewithmosh.OOP.taxcalculator;

public class Main {

    // Tax Calculator  (Interface example)
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
    }
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}