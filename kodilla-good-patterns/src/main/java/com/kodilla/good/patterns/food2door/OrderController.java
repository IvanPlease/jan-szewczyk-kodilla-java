package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderController {

    public Drivers getAvailableDriver(List<Drivers> driversList){
        for(Drivers drivers:driversList){
            if(drivers.isAvailable()){
                return drivers;
            }
        }
        return null;
    }
}
