package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderDTO {

    private String orderNumber;
    private final UserDTO user;
    private final Map<DishesDTO, Integer> dishes;
    private boolean isOrdered;

    public OrderDTO(UserDTO user, Map<DishesDTO, Integer> dishes) {
        this.user = user;
        this.dishes = dishes;
    }

    public OrderDTO(String orderNumber, UserDTO user, Map<DishesDTO, Integer> dishes, boolean isOrdered) {
        this.orderNumber = orderNumber;
        this.user = user;
        this.dishes = dishes;
        this.isOrdered = isOrdered;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public UserDTO getUser() {
        return user;
    }

    public Map<DishesDTO, Integer> getDishes() {
        return dishes;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
