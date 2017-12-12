package com.kodilla.exception.test;

public class Flight {
    String departureAirport, arrivalAirport;

    public String getDepartureAirport () {
        return departureAirport;
    }

    public String getArrivalAirport () {
        return arrivalAirport;
    }

    public Flight (String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;


    }
}
