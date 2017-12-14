package com.kodilla.good.patterns.challenges.ProductOrderServicePack;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor (InformationService informationService,
                           OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto orderProcess (final OrderRequest orderRequest) {

        System.out.println("\n" + "<OrderProcessor> - Start");

        boolean isOrdered = orderService.ordered(orderRequest.getUser(),
                orderRequest.getOrderTime(), orderRequest.getProduct());

        System.out.println("Order from: " + orderRequest.getUser() + "  " + orderRequest.getProduct());
        System.out.println("isOrdered: " + isOrdered);

        if (isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getOrderTime(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getUser(),
                    orderRequest.getOrderTime(), orderRequest.getProduct());
            System.out.println("<OrderProcess> - End");
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("<OrderProcess> - End");
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
