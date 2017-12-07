package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

//Klasa World powinna zawierać kolekcję kontynentów
//W klasie World napisz metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal,
// która używając flatMap() oraz reduce()
// obliczy sumę ludności wszystkich krajów na wszystkich kontynentach.
//public BigDecimal peopleQuantity;

public class World {
    List<Continent> worldList;

    public World () {
        this.worldList = Arrays.asList(
                        new ContinentA(),
                        new ContinentB(),
                        new ContinentC());
    }

    public List<Continent> getWorldList() {
        return worldList;
    }

    public BigDecimal getPeopleQuantity() {

        BigDecimal worldPeopleQuantity = worldList.stream()
                .flatMap(continent -> continent.continentCountryList.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return worldPeopleQuantity;
    }

    @Override
    public String toString () {
        return "World{" +
                "world=" + getPeopleQuantity() +
                '}';
    }
}
