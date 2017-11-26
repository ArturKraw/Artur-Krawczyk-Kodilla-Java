package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticCounterTestSuite {
/*
    @Test
    public void calculateAdvStatistics(Statistics statistics) {
        //Given
        Statistics statisticksMock = mock(Statistics.class);

        int usersQuantity = 3;

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        List<String> usersNames = new ArrayList<>();

        StringBuilder sb = new StringBuilder("Name");

        for (int i = 0; i < usersQuantity;  i++){
            sb = sb.append(i);
            usersNames.add(sb.toString());
            System.out.println(sb.toString());
        }

        HashMap<String, Integer> statisticsMap = new HashMap <String, Integer>();
        for (int n =0; n < usersQuantity; n++) {
            statisticsMap.put(usersNames.get(n), n);
            System.out.println(n + "  " + usersNames.get(n));
        }

        when(statisticsMap.getStatisticks()).thenReturn(statisticsMap);

        StatisticsCounter  statisticsCounter = new StatisticsCounter (statisticsMock);

        //When
        int quantityOfSensors = statisticsCounter.calculateStatistics().size();

        //Then
        Assert.assertEquals(3, quantityOfUsers);
    }
*/
}
