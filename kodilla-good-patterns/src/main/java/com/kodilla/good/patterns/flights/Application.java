package com.kodilla.good.patterns.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        AirControl airControl = new AirControl();
        List<Flights> flightsList = airControl.checkAirStatus("Gdansk", "Wroclaw", true);
        if(flightsList.isEmpty()){
            System.out.println("Nie znaleziono pasujących lotów");
        }else{
            System.out.println("Znalezione loty: ");
            for(Flights flights:flightsList){
                System.out.println("Lotnisko początkowe: "+flights.getDepartureAirport().getName()+"\nLotnisko końcowe: "+flights.getArrivalAirport().getName()+"\nPrzesiadki: "+flights.isDirect()+"\n");
            }
        }
    }
}
