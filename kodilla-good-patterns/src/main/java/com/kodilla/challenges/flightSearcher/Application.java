package com.kodilla.challenges.flightSearcher;

public class Application {

    public static void main(String[] args) {
        CheckYourFlight checkYourFlight = new CheckYourFlight();

        Airport airportFrom = new Airport("Wrocław");
        Airport airportTo = new Airport("Kraków");

        System.out.println("\nAvailable direct flights from: " + airportFrom + "\n->" +checkYourFlight.findFlightsFrom(airportFrom));
        System.out.println("\nAvailable direct flights to go to: " + airportTo + "\n->" + checkYourFlight.findFlightsTo(airportTo));

        checkYourFlight.findFlightVia(new Airport("Warszawa"), new Airport("Szczecin"));
    }
}