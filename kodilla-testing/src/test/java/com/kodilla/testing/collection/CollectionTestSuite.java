package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> expectedList = new ArrayList<>();
        emptyList.add(7);
        emptyList.add(9);
        expectedList.add(10);
        emptyList.add(10);
        emptyList.add(1);
        emptyList.add(243);
        expectedList.add(2);
        emptyList.add(2);
        expectedList.add(6);
        emptyList.add(6);
        emptyList.add(15);
        //When
        emptyList = oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(expectedList.size(), emptyList.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList (){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        ArrayList<Integer> expectedList = new ArrayList<>();
        normalList.add(7);
        normalList.add(9);
        expectedList.add(10);
        normalList.add(10);
        normalList.add(1);
        normalList.add(243);
        expectedList.add(2);
        normalList.add(2);
        expectedList.add(6);
        normalList.add(6);
        normalList.add(15);
        //When
        normalList = oddNumbersExterminator.exterminate(normalList);
        //Then
        Assert.assertEquals(normalList.size(), expectedList.size());

    }

}
