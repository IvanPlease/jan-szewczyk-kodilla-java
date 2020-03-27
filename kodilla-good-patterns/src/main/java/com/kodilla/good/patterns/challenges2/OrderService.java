package com.kodilla.good.patterns.challenges2;

import java.util.Map;

public interface OrderService {

    boolean createOrder(UserDTO userDTO, Map<ProductsDTO, Integer> products);
}
