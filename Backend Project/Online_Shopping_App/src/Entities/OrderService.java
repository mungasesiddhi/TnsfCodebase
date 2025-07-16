package Entities;

import java.util.*;

public class OrderService {
    private List<Order> orders;

    public OrderService(List<Order> orders) {
        this.orders = orders;
    }

    public void placeOrder(Customer customer, List<ProductQuantityPair> productList) {
        Order order = new Order(customer, productList);
        orders.add(order);
        customer.getOrders().add(order);
    }

    public List<Order> getOrdersByCustomerId(int customerId) {
        List<Order> result = new ArrayList<>();
        for (Order o : orders) if (o.getCustomer().getUserId() == customerId) result.add(o);
        return result;
    }
}
