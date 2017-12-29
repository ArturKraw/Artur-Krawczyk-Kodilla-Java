package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    Bigmac bigmac = new Bigmac.BigmacBuilder()
            .roll("standard")
            .burgers(2)
            .sauce("barbecue")
            .ingredient("cheese")
            .ingredient("salad")
            .ingredient("onion")
            .build();


    @Test
    public void testBigMacIngredients() {
        //Given
        System.out.println("\n" + bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        System.out.println("Test to check: quantity of Ingredients (" + howManyIngredients + ") - " + (howManyIngredients==3)) ;
    }

    @Test
    public void testBigMacBurgersQunatity() {
        //Given
        System.out.println("\n" + bigmac);
        //When
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(2, howManyBurgers);
        System.out.println("Test to check: quantity of burgers (" + howManyBurgers + ") - " + (howManyBurgers==2)) ;
    }

    @Test
    public void testBigMacRoll() {
        //Given
        System.out.println("\n" + bigmac);
        //When
        String rollType = bigmac.getRoll();
        //Then
        Assert.assertEquals("standard", rollType);
        System.out.println("Test to check: type of roll (" + rollType + ") - " + (rollType=="standard")) ;
    }

    @Test
    public void testBigMacSauce() {
        //Given
        System.out.println("\n" + bigmac);
        //When
        String sauce = bigmac.getSauce();
        //Then
        Assert.assertEquals("barbecue", sauce);
        System.out.println("Test to check: type of sauce (" + sauce + ") - " + (sauce=="barbecue")) ;
    }
}
