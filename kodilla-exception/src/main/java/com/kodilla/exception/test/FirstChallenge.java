package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;

    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(7, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You are not qualified enough to divide by zero :( !!! Caught error: " + e);
        } finally {
            System.out.println("Result: ");
        }
    }
}