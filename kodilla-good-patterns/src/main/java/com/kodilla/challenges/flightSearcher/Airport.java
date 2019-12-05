package com.kodilla.challenges.flightSearcher;

import java.util.Objects;

public class Airport {
    private String airport;

    Airport(String airport) {
        this.airport = airport;
    }

    private String getAirport() {
        return airport;
    }

    @Override
    public String toString() {
        return airport ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport1 = (Airport) o;
        return getAirport().equals(airport1.getAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAirport());
    }
}
