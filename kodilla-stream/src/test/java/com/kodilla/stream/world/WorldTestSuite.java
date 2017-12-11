package com.kodilla.stream.world;

import com.kodilla.stream.sand.Africa;
import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WorldTestSuite {
    //W katalogu src/test/java stwórz pakiet com.kodilla.stream.world, a w nim zestaw testów WorldTestSuite
    //Napisz test testGetPeopleQuantity(), który przetestuje czy metoda () klasy World działa prawidłowo

    //Create list fo all countries
    List<Country> getCountryList() {
        List<Country> countryList = Arrays.asList(
                new Country("Country1", new BigDecimal("100000000"), "ContinentA"),
                new Country("Country2", new BigDecimal("50000000"), "ContinentB"),
                new Country("Country3", new BigDecimal("30000000"), "ContinentC"),
                new Country("Country4", new BigDecimal("120000000"), "ContinentA"),
                new Country("Country5", new BigDecimal("80000000"), "ContinentB"),
                new Country("Country6", new BigDecimal("220000000"), "ContinentC"),
                new Country("Country7", new BigDecimal("150000000"), "ContinentA"),
                new Country("Country8", new BigDecimal("130000000"), "ContinentB"),
                new Country("Country9", new BigDecimal("500000000"), "ContinentC"),
                new Country("Country10", new BigDecimal("400000000"), "ContinentA"),
                new Country("Country11", new BigDecimal("1000000000"), "ContinentB"),
                new Country("Country12", new BigDecimal("1500000000"), "ContinentC"),
                new Country("Country13", new BigDecimal("950000000"), "ContinentA"),
                new Country("Country14", new BigDecimal("900000000"), "ContinentC")
        );
        return countryList;
    }

    @Test
    public void testGetPeopleQuantity () {
        //Given
            World world = new World();

        //When
            BigDecimal totalWorldPeople = world.getPeopleQuantity();
            BigDecimal expectTotalWorldPeople = getCountryList().stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        //Then
        Assert.assertEquals(expectTotalWorldPeople, totalWorldPeople );
        System.out.println("Total world population (by program) : " + totalWorldPeople);
        System.out.println("Total world population (global list): " + expectTotalWorldPeople + "\n");
    }


    @Test
    public void testGetCountryQuantity () {
        //Given
            World world = new World();
        //When
            long totalWorldCountries = world.getWorldList().stream()
                    .flatMap(continent -> continent.getContinentCountryList().stream())
                    .map(Country::getName).count();
            int expectTotalWorldCountries = getCountryList().size();

        //Then
        Assert.assertEquals(expectTotalWorldCountries, totalWorldCountries );
        System.out.println("Quantity of countries in the world (program): " + totalWorldCountries);
        System.out.println("Quantity of countries in the world (global list): " + expectTotalWorldCountries + "\n");
    }
}

