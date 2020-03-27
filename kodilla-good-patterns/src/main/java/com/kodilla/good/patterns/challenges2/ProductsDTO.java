package com.kodilla.good.patterns.challenges2;

import java.math.BigDecimal;

public final class ProductsDTO {

    private final String name;
    private final String desc;
    private final BigDecimal price;

    public ProductsDTO(String name, String desc, BigDecimal price) {
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
