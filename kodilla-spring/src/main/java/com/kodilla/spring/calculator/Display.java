package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
public class Display {

    public void displayValue(double val){
        System.out.printf("\n" + "Result (in Display): ");
        System.out.printf("%.2f", val);
        System.out.println();
    }
}
