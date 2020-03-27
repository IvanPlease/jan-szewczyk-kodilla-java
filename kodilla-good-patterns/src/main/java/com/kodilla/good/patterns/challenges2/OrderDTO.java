package com.kodilla.good.patterns.challenges2;

import java.util.Map;

public class OrderDTO {

    private String orderNumber;
    private final UserDTO user;
    private final Map<ProductsDTO, Integer> products;
    private boolean isOrdered;

    public OrderDTO(UserDTO user, Map<ProductsDTO, Integer> products) {
        this.user = user;
        this.products = products;
    }

    public OrderDTO(String orderNumber, UserDTO user, Map<ProductsDTO, Integer> products, boolean isOrdered) {
        this.orderNumber = orderNumber;
        this.user = user;
        this.products = products;
        this.isOrdered = isOrdered;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public UserDTO getUser() {
        return user;
    }

    public Map<ProductsDTO, Integer> getProducts() {
        return products;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
