package com.kodilla.challenges.flightSearcher;

import java.util.Objects;

public class Flight {
    private Airport fromAirport;
    private Airport toAirport;
    private Airport middleAirport;

    Flight(Airport fromAirport,
           Airport toAirport) {
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
    }

    public Flight(Airport fromAirport,
                  Airport toAirport,
                  Airport middleAirport) {
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.middleAirport = middleAirport;
    }

    Airport getFromAirport() {
        return fromAirport;
    }

    Airport getToAirport() {
        return toAirport;
    }

    @Override
    public String toString() {
        if(middleAirport != null) {
            return fromAirport +
                    " -> " + toAirport + " -> " + middleAirport;
        }else {
            return fromAirport +
                    " -> " + toAirport;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getFromAirport().equals(flight.getFromAirport()) &&
                getToAirport().equals(flight.getToAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFromAirport(), getToAirport());
    }
}
