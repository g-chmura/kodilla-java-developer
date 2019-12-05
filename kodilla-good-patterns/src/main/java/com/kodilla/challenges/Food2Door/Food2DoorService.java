package com.kodilla.challenges.Food2Door;

class Food2DoorService {

    private ExecuteOrder executeOrder;

    Food2DoorService(ExecuteOrder executeOrder) {
        this.executeOrder = executeOrder;
    }

    ExecuteOrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = executeOrder.process(orderRequest.getSupplier(),
                                                 orderRequest.getProducts(),
                                                 orderRequest.getQuantity());
        if(isOrdered) {
            return new ExecuteOrderDTO(orderRequest.getSupplier(), true);
        } else {
            return new ExecuteOrderDTO(orderRequest.getSupplier(), false);
        }
    }
}
