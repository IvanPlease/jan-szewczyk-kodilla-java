package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Flights {

    private Long id;
    private final Airports arrivalAirport;
    private final Airports departureAirport;
    private final boolean direct;
    private final Planes plane;
    private final List<Airports> stopList = new ArrayList<>();

    public Flights(Airports arrivalAirport, Airports departureAirport, boolean direct, Planes plane) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.direct = direct;
        this.plane = plane;
    }

    public boolean isDirect() {
        return direct;
    }

    public void addStopList(Airports stopAirports) {
        stopList.add(stopAirports);
    }

    public List<Airports> getStopList() {
        return stopList;
    }

    public Airports getArrivalAirport() {
        return arrivalAirport;
    }

    public Airports getDepartureAirport() {
        return departureAirport;
    }

    public Planes getPlane() {
        return plane;
    }
}
