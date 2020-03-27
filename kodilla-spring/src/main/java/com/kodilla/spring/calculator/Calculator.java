package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    Display display;

    public Calculator() {
        display = new Display();
    }

    public double add(double a, double b){
        double res = a + b;
        return display.displayValue(res);
    }

    public double sub(double a, double b){
        double res = a - b;
        return display.displayValue(res);
    }

    public double mul(double a, double b){
        double res = a * b;
        return display.displayValue(res);
    }

    public double div(double a, double b){
        double res = a / b;
        return display.displayValue(res);
    }

}
