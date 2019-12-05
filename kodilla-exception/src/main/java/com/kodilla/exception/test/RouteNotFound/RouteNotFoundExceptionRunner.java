
package com.kodilla.exception.test.RouteNotFound;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight1 = new Flight("Cracov", "Warsaw");
        Flight flight2 = new Flight("Berlin", "Lamezia di Terme");
        Flight flight3 = new Flight("Cracov", "Berlin");

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight3);
        }
        catch (RouteNotFoundException e) {
            System.out.println("Flight wasn't found! :(");
        }
        finally {
            System.out.println("I tried my best! :)");
        }
    }
}