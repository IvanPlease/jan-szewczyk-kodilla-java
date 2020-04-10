package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsImitation {
    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airportsAvilable = new HashMap<>();
        airportsAvilable.put("LAX", true);
        String arivals = flight.getArrivalAirport();
        Boolean b = airportsAvilable.get(arivals);
        if(!b){
            throw new RouteNotFoundException();
        }
        return b;
    }
}
