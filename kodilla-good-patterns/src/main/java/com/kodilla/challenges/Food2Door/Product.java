package com.kodilla.challenges.Food2Door;

import java.util.Objects;

public class Product {
    private String product;

    Product(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return product + "; ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product1 = (Product) o;
        return Objects.equals(getProduct(), product1.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduct());
    }
}
