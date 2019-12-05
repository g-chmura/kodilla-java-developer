package com.kodilla.challenges.Food2Door;

import java.util.List;

public interface ExecuteOrder {

    boolean process(Supplier supplier,
                    List<Product> products,
                    Quantity quantity);
}
