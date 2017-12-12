package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public void RouteNotFoundExceptionMet() {
        System.out.println("\n" + "RouteNotFoundException Method (to take cae of nullException");
        System.out.println("Flight destination not found. Please enter new destination (arrivalAirport).");
    }
}
