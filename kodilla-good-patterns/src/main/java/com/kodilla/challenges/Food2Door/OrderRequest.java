package com.kodilla.challenges.Food2Door;

import java.util.List;

public class OrderRequest {
    private Supplier supplier;
    private List<Product> products;
    private Quantity quantity;

    OrderRequest(Supplier supplier,
                 List<Product> products,
                 Quantity quantity) {
        this.supplier = supplier;
        this.products = products;
        this.quantity = quantity;
    }

    Supplier getSupplier() {
        return supplier;
    }

    Quantity getQuantity() {
        return quantity;
    }

    public List<Product> getProducts() {
        return products;
    }
}
