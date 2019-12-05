package com.kodilla.challenges.Food2Door;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class OrderRetriever {

    OrderRequest retrieve() {

        Supplier supplier = new Supplier("ExtraFoodShop");

        Product product1 = new Product("Milk");
        Product product2 = new Product("Lettuce");
        Product product3 = new Product("Milk");
        Product product4 = new Product("Potatoes");

        List<Product> products = new ArrayList<>(Arrays.asList(product1, product2, product3, product4));

        Quantity quantity = new Quantity(products);


        return new OrderRequest(supplier, products, quantity);
    }
}
