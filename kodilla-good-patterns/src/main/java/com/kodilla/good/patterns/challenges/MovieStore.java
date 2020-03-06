package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MovieStore {

    private static final String badTCode = "Zły kod tłumaczenia";
    private static final String plTCode = "PL";
    private static final String enTCode = "EN";
    private static final String seperator = " ! ";
    private static final String ironManPL = "Żelazny Człowiek";
    private static final String ironManEN = "Iron Man";
    private static final String avengersPL = "Mściciele";
    private static final String avengersEN = "Avengers";
    private static final String flashPL = "Błyskawica";
    private static final String flashEN = "Flash";
    private static final String ironManCode = "IM";
    private static final String avengersCode = "AV";
    private static final String flashCode = "FL";

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add(ironManPL);
        ironManTranslations.add(ironManEN);

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add(avengersPL);
        avengersTranslations.add(avengersEN);

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add(flashPL);
        flashTranslations.add(flashEN);

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put(ironManCode, ironManTranslations);
        booksTitlesWithTranslations.put(avengersCode, avengersTranslations);
        booksTitlesWithTranslations.put(flashCode, flashTranslations);

        return booksTitlesWithTranslations;
    }


    public void getTitles(String lang){
        int i = 0;
        for(Map.Entry<String, List<String>> e:getMovies().entrySet()){

            if (i!=0)
                System.out.print(seperator);

            if (lang.equals(plTCode)) {
                System.out.print(e.getValue().get(0));
            } else if (lang.equals(enTCode)) {
                System.out.print(e.getValue().get(1));
            } else {
                System.out.println(badTCode);
            }

            i++;

        }
    }

}