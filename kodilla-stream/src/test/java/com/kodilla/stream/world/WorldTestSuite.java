package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent asia = new Continent();
        Continent europe = new Continent();
        Continent america = new Continent();
        Continent africa = new Continent();
        //When
        europe.addCountry(new Country(new BigDecimal("50661347"), "Poland"));
        europe.addCountry(new Country(new BigDecimal("89570810"), "Poland"));
        europe.addCountry(new Country(new BigDecimal("49562503"), "Poland"));
        europe.addCountry(new Country(new BigDecimal("57762837"), "Poland"));
        asia.addCountry(new Country(new BigDecimal("9308291"), "Poland"));
        asia.addCountry(new Country(new BigDecimal("40487832"), "Poland"));
        asia.addCountry(new Country(new BigDecimal("11227245"), "Poland"));
        asia.addCountry(new Country(new BigDecimal("11760300"), "Poland"));
        asia.addCountry(new Country(new BigDecimal("95864905"), "Poland"));
        asia.addCountry(new Country(new BigDecimal("43961349"), "Poland"));
        asia.addCountry(new Country(new BigDecimal("27755751"), "Poland"));
        asia.addCountry(new Country(new BigDecimal("78441175"), "Poland"));
        asia.addCountry(new Country(new BigDecimal("38453697"), "Poland"));
        america.addCountry(new Country(new BigDecimal("47627072"), "Poland"));
        america.addCountry(new Country(new BigDecimal("64429470"), "Poland"));
        america.addCountry(new Country(new BigDecimal("7976112"), "Poland"));
        america.addCountry(new Country(new BigDecimal("97544135"), "Poland"));
        america.addCountry(new Country(new BigDecimal("2528286"), "Poland"));
        america.addCountry(new Country(new BigDecimal("4773330"), "Poland"));
        america.addCountry(new Country(new BigDecimal("87483750"), "Poland"));
        america.addCountry(new Country(new BigDecimal("93922236"), "Poland"));
        africa.addCountry(new Country(new BigDecimal("99853502"), "Poland"));
        africa.addCountry(new Country(new BigDecimal("45489592"), "Poland"));
        africa.addCountry(new Country(new BigDecimal("73284215"), "Poland"));
        africa.addCountry(new Country(new BigDecimal("6466035"), "Poland"));
        world.addContinent(asia);
        world.addContinent(america);
        world.addContinent(europe);
        world.addContinent(africa);
        //Then
        Assert.assertEquals(new BigDecimal("1236195777"), world.getPeopleQuantity());

    }

}
