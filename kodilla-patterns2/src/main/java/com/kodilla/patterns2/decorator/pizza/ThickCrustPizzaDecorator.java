package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThickCrustPizzaDecorator extends AbstractPizzaOrderDecorator {
    protected ThickCrustPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(12));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + thick crust";
    }
}
