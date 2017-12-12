package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightChecking {
    private static Boolean flightFound;


    public Boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map <String, Boolean> flightMap = new HashMap <String, Boolean>();
        flightMap.put("London", true);
        flightMap.put("Amsterdam", true);
        flightMap.put("Berlin", true);
        flightMap.put("Paris", false);
        flightMap.put("Rome", false);
        flightMap.put("Moscow", false);

        try {
            System.out.println("\n" + "try section - FlightChecking");
            int i = 0;
            System.out.println("Destination: " + flight.getArrivalAirport());
            for (Map.Entry <String, Boolean> entry : flightMap.entrySet()) {
                System.out.println("i: " + i + " " + " Airport: " + entry.getKey());

                if (entry.getKey().equals(flight.getArrivalAirport())) {
                    flightFound = entry.getValue();

                    System.out.println("Result FlightChecking try: ");
                    System.out.println("Connection between Warsaw nad destination Airport (" + flight.getArrivalAirport() + ") exist: " + getFlightFound());
                    i++;
                    return flightFound;
                }
            }

                    if (flightFound == null) {
                       throw new RouteNotFoundException();
                    }


        } catch (RouteNotFoundException e) {
            System.out.println("\n" + "catch section - FlightChecking");
            System.out.println("Error: " + e);
            System.out.println("Sorry ! It's necessary to change destinationAirport.");

            throw new RouteNotFoundException();
            //return flightFound;

        } finally {
            System.out.println("\n" + "finally section - FlightChecking");
            System.out.println("Flight Checking done !");
        }

        if (flightFound != (null)) {
            flightFound = (false);  //???
        }
        System.out.println("Result FlightChecking finally: ");
        System.out.println("Connection between Warsaw nad destination Airport (" + flight.getArrivalAirport() + ") exist: " + flightFound);
        return flightFound;
    }
    public static Boolean getFlightFound () {
        return flightFound;
    }

}
