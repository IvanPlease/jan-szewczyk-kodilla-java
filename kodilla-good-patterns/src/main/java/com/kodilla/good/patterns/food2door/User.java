package com.kodilla.good.patterns.food2door;

public final class User {

    private final String name;
    private final String address;
    private final String email;

    public String getEmail() {
        return email;
    }

    public User(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}