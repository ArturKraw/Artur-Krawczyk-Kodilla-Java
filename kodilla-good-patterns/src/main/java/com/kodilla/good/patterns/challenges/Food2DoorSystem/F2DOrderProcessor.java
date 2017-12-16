package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class F2DOrderProcessor {

    private F2DInformationService informationService;
    private F2DOrderService orderService;
    private F2DOrderRepository orderRepository;

    public F2DOrderProcessor (F2DInformationService informationService,
                           F2DOrderService orderService, F2DOrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public F2DorderDto orderProcessF2D (final OrderRequest orderRequest) {

        System.out.println("\n" + "<OrderProcessor> - Start");

        boolean isOrdered = orderService.ordered(orderRequest.getOrderId(), orderRequest.getUser(),
                orderRequest.getOrderTime(), orderRequest.getProductProvider(), orderRequest.getOrderSet());

        System.out.println("Order: " + "\n" + orderRequest);
        System.out.println("isOrdered: " + isOrdered);

        if (isOrdered) {
            informationService.inform(orderRequest.getOrderId(), orderRequest.getUser(), orderRequest.getOrderTime(), orderRequest.getProductProvider(), orderRequest.getOrderSet());
            orderRepository.createOrder(orderRequest.getOrderId(), orderRequest.getUser(), orderRequest.getProductProvider(),
                    orderRequest.getOrderTime(), orderRequest.getOrderSet());
            System.out.println("<OrderProcess> - End");
            return new F2DorderDto(orderRequest.getUser(), orderRequest.getProductProvider(),  true, orderRequest.getOrderId());
        } else {
            System.out.println("<OrderProcess> - End");
            return new F2DorderDto(orderRequest.getUser(), orderRequest.getProductProvider(),  false, orderRequest.getOrderId());
        }
    }
}

