package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //When
        int[] num = {10,11,12,13,14,15,10,11,12,13,14,15};
        //Given
        double avg = ArrayOperations.getAverage(num);
        //Then
        Assert.assertEquals(12.5, avg, 0.001);
    }
}
