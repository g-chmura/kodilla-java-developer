package com.kodilla.challenges.orderService;


public class Application {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(new PlaceOrderInDatabase(), new OrderProducts(), new Notification());

        productOrderService.process(order);
    }
}