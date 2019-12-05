package com.kodilla.testing.calculator;

public class CalculatorTestSuite {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(2,5);
        int subResult = calculator.subtract(2,5);
        if((addResult == 7) && (subResult == -3)) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
