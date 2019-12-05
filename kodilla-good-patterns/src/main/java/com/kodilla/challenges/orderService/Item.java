package com.kodilla.challenges.orderService;

class Item {

    private final String itemName;

    Item(final String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Item{\"" + itemName + "\"";
    }
}