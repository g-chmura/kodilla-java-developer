package com.kodilla.challenges.orderService;

import java.time.LocalDateTime;

public interface OrderDatabase {

    void addOrder(final User user,
                  final Products products,
                  LocalDateTime localDateTime,
                  boolean isOrderConfirmed);
}