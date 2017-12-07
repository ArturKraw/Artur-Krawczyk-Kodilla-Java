package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//Klasa Country ma udostępniać metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal

public class Country {
    final private String name;
    final private BigDecimal peopleQuantity;
    final private String continentName;

     public Country (String name, BigDecimal peopleQuantity, String continentName) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
        this.continentName = continentName;
    }


    public String getName () {
        return name;
    }

    public BigDecimal getPeopleQuantity () {
        return peopleQuantity;
    }

    public String getContinentName () {
        return continentName;
    }

    @Override
    public String toString () {
        return "Country{" +
                "name='" + getName() + '\'' +
                ", peopleQuantity=" + getPeopleQuantity() +
                ", continentName='" + getContinentName() + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (getName() != null ? !getName().equals(country.getName()) : country.getName() != null) return false;
        if (getPeopleQuantity() != null ? !getPeopleQuantity().equals(country.getPeopleQuantity()) : country.getPeopleQuantity() != null)
            return false;
        return getContinentName() != null ? getContinentName().equals(country.getContinentName()) : country.getContinentName() == null;
    }

    @Override
    public int hashCode () {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getPeopleQuantity() != null ? getPeopleQuantity().hashCode() : 0);
        result = 31 * result + (getContinentName() != null ? getContinentName().hashCode() : 0);
        return result;
    }
}
