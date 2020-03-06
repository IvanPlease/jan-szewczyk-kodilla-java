package com.kodilla.good.patterns.challenges;

public class ResultPrompts {

    private static String unPaid = "Użytkownik posiada nie opłacone przedmioty";
    private static String boughtProduct = "Przedmiot został już sprzedany";

    public static void noInGoodTerms(){
        System.out.println(unPaid);
    }

    public static void productBought(){
        System.out.println(boughtProduct);
    }

}
