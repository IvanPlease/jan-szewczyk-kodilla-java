package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //When
        int[] num = {0,1,2,3,4,5,6,7,9,10,11,12,13,14,15};
        //Given
        double avg = ArrayOperations.getAverage(num);
        //Then
        Assert.assertEquals(7.5, avg, 0.001);
    }
}
