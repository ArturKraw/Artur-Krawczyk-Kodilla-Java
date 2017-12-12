package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightHandling {

    private static Boolean flightFound;

    public static void main (String args[]) {
        // It is possible to change arrivalAirport
        final String departureAirport = "Warsaw";
        String arrivalAirport = "London";
        // London -> true; Rome -> false ; pekin -> null

        Flight flight = new Flight(departureAirport, arrivalAirport);

        FlightChecking flightChecking = new FlightChecking();


        try {
            System.out.println("\n" + "try section - FlightHandling");
            flightChecking.findFlight(flight);


        } catch (RouteNotFoundException e) {
            System.out.println("\n" + "catch section - FlightHandling");
            System.out.println("Problems with input data  probabaly null!");
            e.RouteNotFoundExceptionMet();

        } finally {
            System.out.println("\n" + "finally section - FlightHandling");
            System.out.println("Result FlightHandling: " + "\n" +
                    "Connection between Warsaw nad destination Airport (" + arrivalAirport + ") exist: " + flightChecking.getFlightFound());
            System.out.println("Done All!");
        }
    }


}
