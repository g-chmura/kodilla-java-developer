package com.kodilla.challenges.orderService;

import java.time.LocalDateTime;

class Order {

    private final User user;
    private final Products products;
    private final LocalDateTime localDateTime;

    Order(final User user,
          final Products products,
          final LocalDateTime localDateTime) {
        this.user = user;
        this.products = products;
        this.localDateTime = localDateTime;
    }

    User getUser() {
        return user;
    }

    Products getProducts() {
        return products;
    }

    LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}