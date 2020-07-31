package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void createBigPizza() {
        //Given
        PizzaOrder thePie = new BasicPizzaOrder();
        thePie = new ChickenPizzaDecorator(thePie);
        thePie = new PeperoniPizzaDecorator(thePie);
        thePie = new SalamiPizzaDecorator(thePie);
        thePie = new PineapplePizzaDecorator(thePie);
        thePie = new SausagePizzaDecorator(thePie);
        thePie = new ThickCrustPizzaDecorator(thePie);
        thePie = new LargePizzaDecorator(thePie);
        //When
        String description = thePie.getDescription();
        //Then
        assertEquals("Pizza z sosem pomidorowym + serem + chicken + peperoni + salami + pineapple + sausage + thick crust [50 cm]", description);
    }
}
