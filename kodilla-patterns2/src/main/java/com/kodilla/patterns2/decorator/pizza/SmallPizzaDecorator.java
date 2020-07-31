package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SmallPizzaDecorator extends AbstractPizzaOrderDecorator {
    protected SmallPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " [25 cm]";
    }
}
