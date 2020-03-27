package com.kodilla.good.patterns.challenges2;

import java.util.Map;

public class OrderRequest {

    private Map<ProductsDTO, Integer> products;
    private UserDTO userDTO;

    public OrderRequest(Map<ProductsDTO, Integer> products, UserDTO userDTO) {
        this.products = products;
        this.userDTO = userDTO;
    }

    public Map<ProductsDTO, Integer> getProducts() {
        return products;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

}
