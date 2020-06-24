package com.kodilla.good.patterns.flights;

public class Airports {
    private Long id;
    private final String name;
    private Long planeCapacity;
    private boolean isOpenForPlanes;

    public Airports(String name, Long planeCapacity, boolean isOpenForPlanes) {
        this.name = name;
        this.planeCapacity = planeCapacity;
        this.isOpenForPlanes = isOpenForPlanes;
    }

    public String getName() {
        return name;
    }

    public Long getPlaneCapacity() {
        return planeCapacity;
    }

    public boolean isOpenForPlanes() {
        return isOpenForPlanes;
    }

    public void setPlaneCapacity(Long planeCapacity) {
        this.planeCapacity = planeCapacity;
    }

    public void changeOpenForPlanes() {
        isOpenForPlanes = !isOpenForPlanes;
    }
}
