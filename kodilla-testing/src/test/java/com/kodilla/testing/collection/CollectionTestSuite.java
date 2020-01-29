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
        //When
        emptyList = oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(0, emptyList.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList (){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        ArrayList<Integer> expectedList = new ArrayList<>();
        normalList.add(7);
        normalList.add(9);
        normalList.add(10);
        normalList.add(1);
        normalList.add(243);
        normalList.add(2);
        normalList.add(6);
        normalList.add(15);
        expectedList.add(7);
        expectedList.add(9);
        expectedList.add(10);
        expectedList.add(1);
        expectedList.add(243);
        expectedList.add(2);
        expectedList.add(6);
        expectedList.add(15);
        //When
        normalList = oddNumbersExterminator.exterminate(normalList);
        expectedList = oddNumbersExterminator.exterminate(expectedList);
        //Then
        Assert.assertEquals(normalList.size(), expectedList.size());

    }

}
