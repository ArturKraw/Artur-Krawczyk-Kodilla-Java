package com.kodilla.testing.calculator;

public class Calculator {
    private int a, b;

    public Calculator(int a, int b) {
        this.a=a;
        this.b=b;
    }
    public Calculator() {
    }

    public void setA(int a) {
        this.a=a;
    }
    public void setB(int b) {
        this.b=b;
    }
    public int add()  {
        return a+b;
    }

    public int subtract()    {
        return a-b;
    }
}
