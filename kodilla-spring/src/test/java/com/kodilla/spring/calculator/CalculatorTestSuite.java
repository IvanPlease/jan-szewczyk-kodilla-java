package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double addResult = calculator.add(2.0, 5.0);
        double subResult = calculator.sub(2.0, 5.0);
        double mulResult = calculator.mul(2.0, 5.0);
        double divResult = calculator.div(2.0, 5.0);
        //Then
        Assert.assertEquals(7.0, addResult, 2);
        Assert.assertEquals(-3.0, subResult, 2);
        Assert.assertEquals(10.0, mulResult, 2);
        Assert.assertEquals(0.4, divResult, 2);
    }
}
