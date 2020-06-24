package com.kodilla.good.patterns.flights;

public class Users {
    private Long id;
    private final String username;
    private final String adress;
    private final String email;
    private final boolean active;

    public Users(String username, String adress, String email, boolean active) {
        this.username = username;
        this.adress = adress;
        this.email = email;
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }
}
