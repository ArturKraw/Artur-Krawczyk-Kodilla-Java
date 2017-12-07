package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

//Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie.
//List<Country> countryList

public abstract class Continent {
    protected String continentName ;
    protected List<Country> continentCountryList;

    public Continent (String continentName, List<Country> continentCountryList) {
        this.continentName = continentName;
        this.continentCountryList = continentCountryList;
    }

    final String getContinentName () {
        return continentName;
    }

    public List<Country> getContinentCountryList () {
        return continentCountryList;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        if (getContinentName() != null ? !getContinentName().equals(continent.getContinentName()) : continent.getContinentName() != null)
            return false;
        return getContinentCountryList() != null ? getContinentCountryList().equals(continent.getContinentCountryList()) : continent.getContinentCountryList() == null;
    }

    @Override
    public int hashCode () {
        int result = getContinentName() != null ? getContinentName().hashCode() : 0;
        result = 31 * result + (getContinentCountryList() != null ? getContinentCountryList().hashCode() : 0);
        return result;
    }

    @Override
    public String toString () {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", continentCountryList=" + continentCountryList +
                '}';
    }
}





