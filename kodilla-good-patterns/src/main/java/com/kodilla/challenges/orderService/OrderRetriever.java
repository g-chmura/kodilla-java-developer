package com.kodilla.challenges.orderService;

import java.time.LocalDateTime;
import java.util.Arrays;

class OrderRetriever {

    Order retrieve() {
        User user = new User("Jan", "Kowalski");
        Products products = new Products(Arrays.asList(new Item("Cyberpunk 20177: preorder"), new Item("core I9-7920X x-series")));
        LocalDateTime localDateTime = LocalDateTime.now();

        return new Order(user, products, localDateTime);
    }
}
