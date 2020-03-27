package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;

public class DishesDTO {

    private final String name;
    private final String desc;
    private final BigDecimal price;

    public DishesDTO(String name, String desc, BigDecimal price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
