package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        OrderController orderController = new OrderController();
        Producent extraFoodShop = new Producent("ExtraFoodShop", "Adress", "extraFoodShop@food2door.pl");
        Producent healthyShop = new Producent("HealthyShop", "Adress", "healthyShop@food2door.pl");
        Producent glutenFreeShop = new Producent("GlutenFreeShop", "Adress", "glutenFreeShop@food2door.pl");
        Dishes makaron = new Dishes("makaron", "makaron", new BigDecimal("5"));
        Dishes sushi = new Dishes("sushi", "sushi", new BigDecimal("15"));
        Dishes frytki = new Dishes("frytki", "frytki", new BigDecimal("5"));
        Dishes zupa = new Dishes("zupa", "zupa", new BigDecimal("34"));
        Dishes woda = new Dishes("woda", "woda", new BigDecimal("1"));
        extraFoodShop.addDish(makaron);
        extraFoodShop.addDish(sushi);
        extraFoodShop.addDish(woda);
        healthyShop.addDish(sushi);
        healthyShop.addDish(zupa);
        healthyShop.addDish(frytki);
        glutenFreeShop.addDish(makaron);
        glutenFreeShop.addDish(frytki);
        List<Drivers> driversList = new ArrayList<>();
        Drivers driversOne = new Drivers("Driver One", "Adress", "driverOne@food2door.pl", true);
        Drivers driversTwo = new Drivers("Driver Two", "Adress", "driverTwo@food2door.pl", true);
        Drivers driversThree = new Drivers("Driver Three", "Adress", "driverThree@food2door.pl", true);
        Drivers driversFour = new Drivers("Driver Four", "Adress", "driverFour@food2door.pl", true);
        driversList.add(driversOne);
        driversList.add(driversTwo);
        driversList.add(driversThree);
        driversList.add(driversFour);
        Map<Dishes, Integer> dishes = new HashMap<>();
        dishes.put(frytki, 5);
        dishes.put(zupa, 5);
        dishes.put(woda, 5);
        User user = new User("Ivan", "Adress", "ivan@gmail.com");
        Drivers currentDriver = orderController.getAvailableDriver(driversList);
        Order order = new Order(user, dishes, currentDriver);
        order.setOrdered(true);
        if(order.isOrdered()){
            System.out.println("Zamowienie jest realizowane");
        }else{
            System.out.println("Zamowienie nie moze zostac zrealizowane");
        }
    }

}
