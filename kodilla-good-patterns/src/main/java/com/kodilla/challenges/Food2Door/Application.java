package com.kodilla.challenges.Food2Door;

public class Application {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieve();
        Food2DoorService food2DoorService = new Food2DoorService(new ExtraFoodShopService());

        food2DoorService.process(orderRequest);
    }
}
