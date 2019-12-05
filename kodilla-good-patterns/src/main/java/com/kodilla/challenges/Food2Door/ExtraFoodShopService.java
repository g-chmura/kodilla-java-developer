package com.kodilla.challenges.Food2Door;

import java.util.List;
import java.util.Random;

public class ExtraFoodShopService implements  ExecuteOrder {

    private Random random = new Random();
    private boolean order = random.nextBoolean();

    @Override
    public boolean process(final Supplier supplier,
                           final List<Product> products,
                           final Quantity quantity) {

        System.out.println("Informations about the order." +
                           "\nSupplier: " + supplier.getSupplier() +
                           "\nProducts and quantity: " + quantity.getQuantity(products) +
                           "\nIs order confirmed: " + order);

        return order;
    }
}
