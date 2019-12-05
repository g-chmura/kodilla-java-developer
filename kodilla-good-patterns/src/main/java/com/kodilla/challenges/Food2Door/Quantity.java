package com.kodilla.challenges.Food2Door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Quantity {

    private Map<Product, Integer> quantityMap = new HashMap<>();

    Quantity(List<Product> products) {
    }

    Map<Product, Integer> getQuantity(List<Product> products) {
        for(Product product : products) {
            if(!quantityMap.containsKey(product)) {
                quantityMap.put(product, 1);
            } else {
                int quantity = quantityMap.get(product) + 1;
                quantityMap.put(product, quantity);
            }
        }
        return quantityMap;
    }
}