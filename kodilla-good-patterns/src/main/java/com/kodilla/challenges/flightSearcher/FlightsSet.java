package com.kodilla.challenges.flightSearcher;

import java.util.HashSet;
import java.util.Set;

class FlightsSet {

    private static final Airport WAR = new Airport("Warszawa");
    private static final Airport KRK = new Airport("Kraków");
    private static final Airport GDA = new Airport ("Gdańsk");
    private static final Airport WRO = new Airport("Wrocław");
    private static final Airport SZCZ = new Airport("Szczecin");

    private static Set<Flight> flightSet = new HashSet<>();

    static {
        flightSet.add(new Flight(WAR, KRK));
        flightSet.add(new Flight(WAR, GDA));
        flightSet.add(new Flight(WAR, WRO));
        flightSet.add(new Flight(SZCZ, WAR));
        flightSet.add(new Flight(KRK, GDA));
        flightSet.add(new Flight(KRK, SZCZ));
        flightSet.add(new Flight(WRO, KRK));
        flightSet.add(new Flight(WRO, GDA));
        flightSet.add(new Flight(WRO, SZCZ));
        flightSet.add(new Flight(GDA, WAR));
        flightSet.add(new Flight(GDA, KRK));
        flightSet.add(new Flight(SZCZ, WRO));
    }

    static Set<Flight> getFlightSet() {
        return new HashSet<>(flightSet);
    }
}
