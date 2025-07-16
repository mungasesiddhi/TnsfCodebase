package Entities;

import java.util.*;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService(List<Customer> customers) {
        this.customers = customers;
    }

    public void createCustomer(Customer customer) { customers.add(customer); }
    public List<Customer> getCustomers() { return customers; }
}

