package com.kodilla.patterns.singleton;

import com.kodilla.patterns.com.kodilla.patterns.singleton.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    //private static Logger logger;
    private static String text = "This is last log";

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log(text);
        //When
        String textFromLogger = Logger.getInstance().getLastLog();
        System.out.println("LastLog: " + text + " //LoggerTestSuite - text put in Test " );
        //Then
        Assert.assertEquals(textFromLogger, text);
    }
}
