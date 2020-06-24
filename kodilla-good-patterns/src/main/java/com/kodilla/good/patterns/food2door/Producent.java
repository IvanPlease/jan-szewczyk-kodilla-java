package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Producent {

    private final String name;
    private final String address;
    private final String email;
    private List<Dishes> producentDishes = new ArrayList<>();

    public Producent(String name, String address, String email) {
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

    public void addDish(Dishes dishes){
        producentDishes.add(dishes);
    }

    public List<Dishes> getProducentDishes() {
        return producentDishes;
    }

    public void removeDish(Dishes dishes){
        producentDishes.remove(dishes);
    }
}
