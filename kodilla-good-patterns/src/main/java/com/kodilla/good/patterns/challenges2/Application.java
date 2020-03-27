package com.kodilla.good.patterns.challenges2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        InformationService emailService = new EmailService();
        OrderRepository repository = new ProductsWarehouse();
        OrderService orderService = new OrderServiceImpl();
        OrdersProcessor ordersProcessor = new OrdersProcessor(emailService, repository, orderService);
        UserDTO userDTO = new UserDTO("Jan", "ul Addres 110");
        ProductsDTO productsDTO = new ProductsDTO("Wedka", "wedka", new BigDecimal(250.0));
        Map<ProductsDTO, Integer> basket = new HashMap<>();
        basket.put(productsDTO, 5);
        OrderRequest orderRequest = new OrderRequest(basket, userDTO);
        OrderDTO orderDTO = ordersProcessor.processOrder(orderRequest);
        if(orderDTO.isOrdered()){
            System.out.println("Zamowienie jest realizowane");
        }else{
            System.out.println("Zamowienie nie moze zostac zrealizowane");
        }
    }

}
