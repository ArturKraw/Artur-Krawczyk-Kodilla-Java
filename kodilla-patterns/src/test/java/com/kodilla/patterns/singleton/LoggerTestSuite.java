package com.kodilla.patterns.singleton;

import com.kodilla.patterns.com.kodilla.patterns.singleton.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;
    private static String text = "This is last log";

    @Test
    public void testGetLastLog() {
        //Given
        logger = new Logger();
        logger.log(text);
        //When
        String textFromLogger = logger.getLastLog();
        System.out.println("LastLog: " + text + " //text put in test " );
        //Then
        Assert.assertEquals(textFromLogger, text);
    }
}
