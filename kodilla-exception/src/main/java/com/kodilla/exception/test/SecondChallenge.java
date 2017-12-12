package com.kodilla.exception.test;


public class SecondChallenge {

    public String probablyIWillThrowException (double x, double y) throws SecondChallengeException {
        try {
            System.out.println("\n" + "try section - Second Challenge");
                if((y ==1.5)||((x>=1)&&(x<2)))
                    throw new SecondChallengeException();
            System.out.println("Good Job. x and y meets criteria");
            System.out.println("x = " + x + "; y = " + y);

        } catch(SecondChallengeException e){
            System.out.println("\n" + "catch section - Second Challenge");
            System.out.println("Error: " + e);
            System.out.println("Sorry ! It's necessary to change x and/or y. " + "\n" +
                    "One of theme (or both) is (are) out of range");
            throw new SecondChallengeException();

        } finally{
            System.out.println("\n" + "finally section - Second Challenge");
            System.out.println("Done SCh!");

        }
        return "Well done";
    }
}
