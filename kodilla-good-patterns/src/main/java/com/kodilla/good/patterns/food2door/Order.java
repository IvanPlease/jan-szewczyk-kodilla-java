package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class Order {

    private String orderNumber;
    private final User user;
    private final Map<Dishes, Integer> dishes;

    private boolean isOrdered;
    private final Drivers driver;

    public Order(User user, Map<Dishes, Integer> dishes, Drivers driver) {
        this.user = user;
        this.dishes = dishes;
        this.driver = driver;
    }

    public Order(String orderNumber, User user, Map<Dishes, Integer> dishes, boolean isOrdered, Drivers driver) {
        this.orderNumber = orderNumber;
        this.user = user;
        this.dishes = dishes;
        this.isOrdered = isOrdered;
        this.driver = driver;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public User getUser() {
        return user;
    }

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }

    public Map<Dishes, Integer> getDishes() {
        return dishes;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
