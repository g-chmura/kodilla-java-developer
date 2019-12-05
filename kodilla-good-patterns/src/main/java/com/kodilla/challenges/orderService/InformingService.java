package com.kodilla.challenges.orderService;

import java.time.LocalDateTime;

public interface InformingService {

    void inform(final User user,
                final Products products,
                final LocalDateTime localDateTime);
}