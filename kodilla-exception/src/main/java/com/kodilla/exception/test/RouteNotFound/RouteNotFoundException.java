package com.kodilla.exception.test.RouteNotFound;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(final String message) {
        super(message);
    }
}