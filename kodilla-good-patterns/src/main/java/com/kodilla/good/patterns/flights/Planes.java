package com.kodilla.good.patterns.flights;

public class Planes {
    private Long id;
    private final String planeType;
    private final Long capacity;
    private final boolean used;

    public Planes(String planeType, Long capacity, boolean used) {
        this.planeType = planeType;
        this.capacity = capacity;
        this.used = used;
    }

    public String getPlaneType() {
        return planeType;
    }

    public Long getCapacity() {
        return capacity;
    }

    public boolean isUsed() {
        return used;
    }
}
