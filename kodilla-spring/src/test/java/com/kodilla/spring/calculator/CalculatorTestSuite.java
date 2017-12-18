package com.kodilla.spring.calculator;


import com.kodilla.spring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DecimalFormat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculationAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 3.5;
        double b = 2.3;
        double result = calculator.add(a,b);
        //Then
        Assert.assertEquals(a+b, result, 0.001);
    }
    @Test
    public void testCalculationSub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 3.5;
        double b = 2.3;
        double result = calculator.sub(a,b);
        //Then
        Assert.assertEquals(a-b, result, 0.001);
    }
    @Test
    public void testCalculationMul() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 3.5;
        double b = 2.3;
        double result = calculator.mul(a,b);
        //Then
        Assert.assertEquals(a*b, result, 0.001);
    }
    @Test
    public void testCalculationDiv() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 3.5;
        double b = 2.3;
        double result = calculator.div(a, b);
        //Then
        Assert.assertEquals(a / b, result, 0.001);
    }

}
