package com.kodilla.good.patterns.challenges2;

public final class UserDTO {

    private final String name;
    private final String address;

    public UserDTO(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
