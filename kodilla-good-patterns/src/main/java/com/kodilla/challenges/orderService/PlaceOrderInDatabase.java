package com.kodilla.challenges.orderService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlaceOrderInDatabase implements OrderDatabase {

    public void addOrder(final User user,
                         final Products products,
                         final LocalDateTime localDateTime,
                         final boolean isOrderConfirmed) {

        DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");
        System.out.println("We are saving your order in our database... Info: \nUser: " + user.getName() + " " + user.getSurname() + "\nList of products: \n"
                + products.getProducts() + "\nDate of order placement:  " + localDateTime.format(dataTimeFormat) + "\nHas been order confirmed? - " + isOrderConfirmed);
    }
}