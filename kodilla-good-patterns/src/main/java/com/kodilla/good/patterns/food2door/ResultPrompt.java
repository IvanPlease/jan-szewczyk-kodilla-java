package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.Scanner;

public class ResultPrompt {

    public static int listProducents(LinkedList<ProducentClass> producentClasses){
        System.out.println("Witaj w serwisie jedzenia na zamowienie!\nWybierz producenta u którego chcesz zlozy zamowienie: ");
        for(ProducentClass pC : producentClasses){
            System.out.println("--------------------------------------");
            System.out.println(producentClasses.indexOf(pC)+1+". "+pC.getName()+"\n   "+pC.getOwnerName()+"\n   "+ pC.getAddress());
        }
        System.out.println("Wybierz nr producenta: ");
        Scanner in = new Scanner(System.in);
        int res;
        do{
            String s = in.nextLine();
            res = Integer.parseInt(s);
        }while(!(res<producentClasses.size() && res>0));
        return res;
    }

}
