package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class AirControl {

    List<Flights> flightsList = new ArrayList<>();
    List<Flights> avFlights = new ArrayList<>();

    public List<Flights> checkAirStatus(String departure, String arrival, boolean stops){
        Airports airports = new Airports("Gdansk", 50L, true);
        Airports airports1 = new Airports("Wroclaw", 35L, true);
        Planes plane = new Planes("Big", 250L, true);
        Planes plane2 = new Planes("Big", 250L, true);
        Flights flights = new Flights(airports, airports1, true, plane);
        Flights flights1 = new Flights(airports1, airports, true, plane2);
        flightsList.add(flights);
        flightsList.add(flights1);
        for(Flights flight: flightsList){
            if(flight.isDirect() == stops && flight.getArrivalAirport().getName().equals(arrival) && flight.getDepartureAirport().getName().equals(departure)){
                avFlights.add(flight);
            }
        }
        return avFlights;
    }

}
