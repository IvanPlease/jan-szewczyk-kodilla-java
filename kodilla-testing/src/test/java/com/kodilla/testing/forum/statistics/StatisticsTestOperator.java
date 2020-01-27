package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestOperator {

    private Statistics statistics = mock(Statistics.class);
    private StatisticsOperator statisticsOperator = new StatisticsOperator();

    @Before
    public void before(){
        List<String> users = new ArrayList<>();
        for(int i=0;i<100;i++){
            users.add("User"+i);
        }
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.commentsCount()).thenReturn(1000);
    }

    @Test
    public void testCalculateStatisticsWhenPostCountIsZero(){
        //Given
        when(statistics.postsCount()).thenReturn(0);
        //When
        statisticsOperator.calculateAdvStatistics(statistics);
        //Then
        assertEquals(0.0, statisticsOperator.getAvgComPost(), 0.01);
        assertEquals( 10.0, statisticsOperator.getAvgComUser(),0.01);
        assertEquals(0.0, statisticsOperator.getAvgPostUser(), 0.01);
    }


    @Test
    public void testCalculateStatisticsWhenPostCountIsThousand(){
        //Given
        when(statistics.postsCount()).thenReturn(1000);
        //When
        statisticsOperator.calculateAdvStatistics(statistics);
        //Then
        assertEquals(1.0, statisticsOperator.getAvgComPost(), 0.01);
        assertEquals( 10.0, statisticsOperator.getAvgComUser(),0.01);
        assertEquals(10.0, statisticsOperator.getAvgPostUser(), 0.01);
    }

}
