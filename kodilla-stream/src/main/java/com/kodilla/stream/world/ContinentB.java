package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;


//Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie.
//List<Country> countryList

public final class ContinentB extends Continent{

    public ContinentB () {
        continentName = "ContinentB";
        continentCountryList = Arrays.asList(
            new Country("Country2", new BigDecimal("50000000"), "ContinentB"),
            new Country("Country5", new BigDecimal("80000000"), "ContinentB"),
            new Country("Country8", new BigDecimal("130000000"), "ContinentB"),
            new Country("Country11", new BigDecimal("1000000000"), "ContinentB")
        );

    }
}




