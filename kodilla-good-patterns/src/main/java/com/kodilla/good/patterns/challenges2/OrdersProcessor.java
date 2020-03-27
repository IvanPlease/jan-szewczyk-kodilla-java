package com.kodilla.good.patterns.challenges2;

public final class OrdersProcessor {

    private final InformationService informationService;
    private final OrderRepository orderRepository;
    private final OrderService orderService;

    public OrdersProcessor(final InformationService informationService,final OrderRepository orderRepository,final OrderService orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDTO processOrder(OrderRequest orderRequest){
        if(orderService.createOrder(orderRequest.getUserDTO(), orderRequest.getProducts())){
            informationService.inform(orderRequest.getUserDTO(), orderRequest.getProducts());
            orderRepository.createOrder(orderRequest.getUserDTO(), orderRequest.getProducts());
            return new OrderDTO("ordr#1", orderRequest.getUserDTO(), orderRequest.getProducts(), true);
        } else {
            return new OrderDTO(orderRequest.getUserDTO(), orderRequest.getProducts());
        }
    }

}
