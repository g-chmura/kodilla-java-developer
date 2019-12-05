package com.kodilla.challenges.orderService;

import java.time.LocalDateTime;

public class Notification implements InformingService {

    public void inform(final User user,
                       final Products products,
                       final LocalDateTime localDateTime) {
        System.out.println("Thank you for shopping with us! We are proceeding your order...");
    }
}
