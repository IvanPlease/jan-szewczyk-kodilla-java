package com.kodilla.good.patterns.food2door;

public class Drivers {

    private final String name;
    private final String address;
    private final String email;
    private boolean available;

    public Drivers(String name, String address, String email, boolean available) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getEmail() {
        return email;
    }
}
