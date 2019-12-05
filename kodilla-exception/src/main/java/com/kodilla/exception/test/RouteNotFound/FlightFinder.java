package com.kodilla.exception.test.RouteNotFound;

        import java.util.*;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<Flight, Boolean> flights = new HashMap<>();
        flights.put(new Flight("Cracov", "Warsaw"), true);
        flights.put(new Flight("Paris", "Berlin"), true);
        flights.put(new Flight("Cracov", "Berlin"), false);


        if(flights.containsKey(flight) &&
                (flights.get(flight).equals(true))) {
            System.out.println("Flight was found! :)");
        }
        else if((flights.containsKey(flight) &&
                (flights.get(flight).equals(false)))) {
            System.out.println("Flight was found, but it's now available now. :(");
        } else {
            throw new RouteNotFoundException("Flight not found !");
        }
    }
}