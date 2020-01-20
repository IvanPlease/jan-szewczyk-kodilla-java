package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> clearArr = new ArrayList<>();
        for(int i : numbers){
            if(i%2==0){
                clearArr.add(i);
            }
        }
        return clearArr;
    }
}
