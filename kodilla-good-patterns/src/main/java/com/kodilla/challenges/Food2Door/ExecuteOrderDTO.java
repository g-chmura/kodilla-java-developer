package com.kodilla.challenges.Food2Door;

public class ExecuteOrderDTO {

    private Supplier supplier;
    private boolean isOrdered;

    ExecuteOrderDTO(Supplier supplier,
                    boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
