package com.kodilla.good.patterns.challenges2;

import java.util.Map;

public interface OrderRepository {

    void createOrder(UserDTO user, Map<ProductsDTO, Integer> products);

}
