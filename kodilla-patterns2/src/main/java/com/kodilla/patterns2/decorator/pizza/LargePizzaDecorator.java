package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class LargePizzaDecorator extends AbstractPizzaOrderDecorator {
    protected LargePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(15));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " [50 cm]";
    }
}
