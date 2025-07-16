package Entities;

import java.util.*;

public class ProductService {
    private List<Product> products;

    public ProductService(List<Product> products) {
        this.products = products;
    }

    public List<Product> getAllProducts() { return products; }
    public Product getProductById(int id) {
        for (Product p : products) if (p.getProductId() == id) return p;
        return null;
    }
}
