package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;
//Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie.
//List<Country> countryList

    public final class ContinentA extends Continent{
        private static final String continentName = "ContinentA";

        public ContinentA (){
            super(continentName ,Arrays.asList(
                    new Country("Country1", new BigDecimal("100000000"), "ContinentA"),
                    new Country("Country4", new BigDecimal("120000000"), "ContinentA"),
                    new Country("Country7", new BigDecimal("150000000"), "ContinentA"),
                    new Country("Country10", new BigDecimal("400000000"), "ContinentA"),
                    new Country("Country13", new BigDecimal("950000000"), "ContinentA")
            ));
        }
}

