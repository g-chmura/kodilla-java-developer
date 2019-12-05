package com.kodilla.exception.test;

import java.time.ZonedDateTime;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(0,1.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Caught error: " + e);
        } finally {
            System.out.println("I told you so...");
        }
    }
}
