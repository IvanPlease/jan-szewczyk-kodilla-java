package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.checkers.*;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .ingredients("Onion")
                .bun("sezam")
                .burgers(2)
                .sauce("standard")
                .ingredients("cheese")
                .ingredients("pickles")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgerPattys = bigmac.getBurgers();
        String bun = bigmac.getBun();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(2, howManyBurgerPattys);
        Assert.assertEquals("sezam", bun);
    }
}
