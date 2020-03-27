package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class ProducentDTO {

    private final String name;
    private final String address;
    private final String email;

    public ProducentDTO(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public void process(){

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
