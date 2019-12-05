package com.kodilla.challenges.orderService;

import java.util.List;

public class Products{

    private List<Item> products;

    Products(final List<Item> products) {
        this.products = products;
    }

    List<Item> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Products{" +
                "products=" + products +
                '}';
    }
}
