package com.kodilla.challenges.orderService;

import java.time.LocalDateTime;

class OrderProducts {

    boolean order(final User user,
                  final Products products,
                  final LocalDateTime localDateTime) {

        System.out.println("You have placed an order.");

        return true;
    }

}