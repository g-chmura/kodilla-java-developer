package com.kodilla.challenges.flightSearcher;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class CheckYourFlight {

    Set<Flight> findFlightsFrom(Airport fromAirport) {
        return FlightsSet.getFlightSet().stream()
                .filter(flight -> flight.getFromAirport().equals(fromAirport))
                .collect(Collectors.toSet());
    }


    Set<Flight> findFlightsTo(Airport toAirport) {
        return FlightsSet.getFlightSet().stream()
                .filter(flight -> flight.getToAirport().equals(toAirport))
                .collect(Collectors.toSet());
    }

    void findFlightVia(Airport fromAirport,
                       Airport toAirport) {
        Set<Flight> flightsFromCity = findFlightsFrom(fromAirport);
        Set<Flight> flightsToCity = findFlightsTo(toAirport);

        Set<Flight> flightsVia = new HashSet<>();

        for(Flight flightFrom : flightsFromCity) {
            for (Flight flightTo : flightsToCity) {
                if (flightFrom.getToAirport().equals(flightTo.getFromAirport())) {
                    flightsVia.add(new Flight(flightFrom.getFromAirport(), flightFrom.getToAirport(), flightTo.getToAirport()));
                }
            }
        }
        System.out.println("\nConnecting flights from: " + fromAirport + ", to: "+ toAirport + "\n-> available connecting flights " + flightsVia);
    }
}