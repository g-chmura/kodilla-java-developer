package com.kodilla.challenges.orderService;


class ProductOrderService {
    private final OrderDatabase orderDatabase;
    private final OrderProducts orderProducts;
    private final InformingService informingService;

    ProductOrderService(final OrderDatabase orderDatabase,
                        final OrderProducts orderProducts,
                        final InformingService informingService) {
        this.orderDatabase = orderDatabase;
        this.orderProducts = orderProducts;
        this.informingService = informingService;
    }

    OrderServiceDTO process(final Order order) {
        boolean isOrderConfirmed = orderProducts.order(
                order.getUser(),
                order.getProducts(),
                order.getLocalDateTime());

        if(isOrderConfirmed) {
            informingService.inform(
                    order.getUser(),
                    order.getProducts(),
                    order.getLocalDateTime());

            orderDatabase.addOrder(
                    order.getUser(),
                    order.getProducts(),
                    order.getLocalDateTime(),
                    true);

            return new OrderServiceDTO(
                    order.getUser(),
                    order.getProducts(),
                    order.getLocalDateTime(),
                    true);
        } else {
            orderDatabase.addOrder(
                    order.getUser(),
                    order.getProducts(),
                    order.getLocalDateTime(),
                    false);

            return new OrderServiceDTO(
                    order.getUser(),
                    order.getProducts(),
                    order.getLocalDateTime(),
                    false);
        }
    }
}