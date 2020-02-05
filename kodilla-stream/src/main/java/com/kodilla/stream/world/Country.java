package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private BigDecimal quantit;
    private String countryName;

    public Country(BigDecimal quantit, String countryName){
        this.quantit = quantit;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity(){
        return quantit;
    }
}
