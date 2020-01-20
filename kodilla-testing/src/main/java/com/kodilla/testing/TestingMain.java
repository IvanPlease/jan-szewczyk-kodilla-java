package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 10);

        if(addResult == 15){
            System.out.println("Pierwszy test OK");
        }else{
            System.out.println("Pierwszy test Błędny");
        }

        int subtractResult = calculator.subtract(15,5);

        if(subtractResult == 10){
            System.out.println("Drugi test OK");
        }else{
            System.out.println("Drugi test Błędny");
        }

    }
}