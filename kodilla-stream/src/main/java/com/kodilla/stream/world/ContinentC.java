package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;


//Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie.
//List<Country> countryList

public final class ContinentC extends Continent{

    public ContinentC () {
        final String continentName = "ContinentC";
        continentCountryList = Arrays.asList(
                new Country("Country3", new BigDecimal("30000000"), "ContinentC"),
                new Country("Country6", new BigDecimal("220000000"), "ContinentC"),
                new Country("Country9", new BigDecimal("500000000"), "ContinentC"),
                new Country("Country12", new BigDecimal("1500000000"), "ContinentC"),
                new Country("Country14", new BigDecimal("900000000"), "ContinentC")
        );
    }
}
