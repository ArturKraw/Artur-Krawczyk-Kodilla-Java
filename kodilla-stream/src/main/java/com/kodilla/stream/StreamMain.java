package com.kodilla.stream;


import com.kodilla.stream.world.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main (String[] args) {

        ContinentA continentA = new ContinentA();
        ContinentB continentB = new ContinentB();
        ContinentC continentC = new ContinentC();

        BigDecimal result1 = continentA.getContinentCountryList().stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("\n" + "ContinentA.Population: " +  result1);

        BigDecimal result2 = continentB.getContinentCountryList().stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("\n" + "ContinentB.Population  " + result2);

        BigDecimal result3 = continentC.getContinentCountryList().stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("\n" + "ContinentC.Population: " + result3);

        BigDecimal resultSum1 = (result1).add(result2).add(result3);
        System.out.println("\n" + "World.Population (sum of 3 continents):  " + resultSum1);

        World world = new World();
        BigDecimal result = world.getPeopleQuantity();
        System.out.println("\n" + "World.Population (program main):  " + result);


        System.out.println("Quantitiy of countries (world): " +
                world.getWorldList().stream()
                .flatMap(continent -> continent.getContinentCountryList().stream())
                .map(Country::getName).count()
                        );
                //
                //.reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Countries names: (world) " +
                world.getWorldList().stream()
                .flatMap(continent -> continent.getContinentCountryList().stream())
                .map(Country::getName)
                .collect(Collectors.toList())
                    );

    }
}










