package com.kodilla.stream.beautifier;

public class BeautifierFunctions {

    public static String generateNew(String tekst){
        String res = "";
        int i = 0;
        for(char r:tekst.toCharArray()){
            if(i%2==0) res+=r;
            i++;
        }
        return res;
    }

    public static String generateNewReverse(String tekst){
        String res = "";
        int i = 0;
        for(char r:tekst.toCharArray()){
            if(i%2!=0) res+=r;
            i++;
        }
        return res;
    }

}
