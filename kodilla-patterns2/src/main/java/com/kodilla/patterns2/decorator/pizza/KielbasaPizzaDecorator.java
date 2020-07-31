package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class KielbasaPizzaDecorator extends AbstractPizzaOrderDecorator {
    protected KielbasaPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + kielbasa";
    }
}
