package Entities;

import java.util.*;

public class AdminService {
    private List<Admin> admins = new ArrayList<>();
    private List<Product> products;
    private List<Order> orders;

    public AdminService(List<Product> products, List<Order> orders) {
        this.products = products;
        this.orders = orders;
    }

    public void addProduct(Product product) { products.add(product); }
    public void removeProduct(int productId) {
        products.removeIf(p -> p.getProductId() == productId);
    }
    public List<Product> getProducts() { return products; }

    public void createAdmin(Admin admin) { admins.add(admin); }
    public List<Admin> getAdmins() { return admins; }

    public void updateOrderStatus(int orderId, String status) {
        for (Order o : orders) if (o.getOrderId() == orderId) o.setStatus(status);
    }

    public List<Order> getOrders() { return orders; }
}
