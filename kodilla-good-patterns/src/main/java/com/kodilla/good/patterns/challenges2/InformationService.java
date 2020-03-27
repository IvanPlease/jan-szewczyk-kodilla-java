package com.kodilla.good.patterns.challenges2;

import java.util.Map;

public interface InformationService {

    void inform(UserDTO userDTO, Map<ProductsDTO, Integer> products);

}
