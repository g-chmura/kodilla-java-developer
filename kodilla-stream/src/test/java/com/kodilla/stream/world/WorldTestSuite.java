package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testPeopleInWorldSum() {

        Country country1 = new Country("country1", new BigDecimal(10000000)) ;
        Country country2 = new Country("country2", new BigDecimal(20000000)) ;
        Country country3 = new Country("country3", new BigDecimal(30000000)) ;
        Country country4 = new Country("country4", new BigDecimal(40000000)) ;
        Country country5 = new Country("country5", new BigDecimal(50000000)) ;
        Country country6 = new Country("country6", new BigDecimal(50000000)) ;
        Country country7 = new Country("country7", new BigDecimal(30000000)) ;
        Country country8 = new Country("country8", new BigDecimal(20000000)) ;
        Country country9 = new Country("country9", new BigDecimal(50000000)) ;

        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();

        continent1.getCountryList().add(country1);
        continent1.getCountryList().add(country2);
        continent1.getCountryList().add(country3);
        continent2.getCountryList().add(country4);
        continent2.getCountryList().add(country5);
        continent2.getCountryList().add(country6);
        continent3.getCountryList().add(country7);
        continent3.getCountryList().add(country8);
        continent3.getCountryList().add(country9);

        World world = new World();
        world.getWorldList().add(continent1);
        world.getWorldList().add(continent2);
        world.getWorldList().add(continent3);

        BigDecimal quanitityOfAllPeople = world.getPeopleQuantity();

        Assert.assertEquals(quanitityOfAllPeople, new BigDecimal("300000000"));
    }
}
