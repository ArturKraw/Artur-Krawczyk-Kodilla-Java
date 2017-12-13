package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightChecking {
    public Boolean cond1;

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map <String, Boolean> flightMap = new HashMap <String, Boolean>();
        flightMap.put("London", true);
        flightMap.put("Amsterdam", true);
        flightMap.put("Berlin", true);

        try {
            System.out.println("\n" + "try section - FlightChecking");
            String destAP = flight.getArrivalAirport();
            System.out.println("Destination: " + destAP);

            if (flightMap.get(destAP) == null) {
                    throw new RouteNotFoundException();
                } else {
                    cond1 = flightMap.get(destAP);
                    System.out.println(" Fligth connection with Airport: " + destAP + "  exist ? " + cond1);
                }

        } catch (RouteNotFoundException e) {
            System.out.println("\n" + "catch section - FlightChecking");
            System.out.println("Error: " + e);
            System.out.println("Sorry ! It's necessary to change destinationAirport.");

            throw new RouteNotFoundException();

        } finally {
            System.out.println("\n" + "finally section - FlightChecking");
            System.out.println("Flight Checking done !");
        }

        System.out.println("Result FlightChecking finally: ");

        System.out.println("Connection between Warsaw nad destination Airport (" +
                flight.getArrivalAirport() + ") exist: " + cond1);
        }

}

