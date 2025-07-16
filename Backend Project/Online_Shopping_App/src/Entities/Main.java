package Entities;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

        AdminService adminService = new AdminService(products, orders);
        CustomerService customerService = new CustomerService(customers);
        ProductService productService = new ProductService(products);
        OrderService orderService = new OrderService(orders);

        while (true) {
            System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) { // Admin Menu
                while (true) {
                    System.out.println("\nAdmin Menu:\n1. Add Product\n2. Remove Product\n3. View Products\n4. Create Admin\n5. View Admins\n6. Update Order Status\n7. View Orders\n8. Return");
                    System.out.print("Choose an option: ");
                    int adminChoice = sc.nextInt();
                    if (adminChoice == 1) {
                        System.out.print("Enter Product ID: "); int id = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter Product Name: "); String name = sc.nextLine();
                        System.out.print("Enter Product Price: "); double price = sc.nextDouble();
                        System.out.print("Enter Stock Quantity: "); int qty = sc.nextInt();
                        adminService.addProduct(new Product(id, name, price, qty));
                        System.out.println("Product added successfully!");
                    } else if (adminChoice == 2) {
                        System.out.print("Enter Product ID to remove: "); int id = sc.nextInt();
                        adminService.removeProduct(id);
                        System.out.println("Product removed!");
                    } else if (adminChoice == 3) {
                        for (Product p : adminService.getProducts()) System.out.println(p);
                    } else if (adminChoice == 4) {
                        System.out.print("Enter Admin ID: "); int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Username: "); String uname = sc.nextLine();
                        System.out.print("Enter Email: "); String email = sc.nextLine();
                        adminService.createAdmin(new Admin(id, uname, email));
                        System.out.println("Admin created!");
                    } else if (adminChoice == 5) {
                        for (Admin a : adminService.getAdmins()) System.out.println(a);
                    } else if (adminChoice == 6) {
                        System.out.print("Enter Order ID: "); int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new status: "); String status = sc.nextLine();
                        adminService.updateOrderStatus(id, status);
                        System.out.println("Order status updated!");
                    } else if (adminChoice == 7) {
                        for (Order o : adminService.getOrders()) System.out.print(o);
                    } else break;
                }

            } else if (choice == 2) { // Customer Menu
                while (true) {
                    System.out.println("\nCustomer Menu:\n1. Create Customer\n2. View Customers\n3. Place Order\n4. View Orders\n5. View Products\n6. Return");
                    System.out.print("Choose an option: ");
                    int custChoice = sc.nextInt();
                    if (custChoice == 1) {
                        System.out.print("Enter User ID: "); int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Username: "); String uname = sc.nextLine();
                        System.out.print("Enter Email: "); String email = sc.nextLine();
                        System.out.print("Enter Address: "); String addr = sc.nextLine();
                        customerService.createCustomer(new Customer(id, uname, email, addr));
                        System.out.println("Customer created!");
                    } else if (custChoice == 2) {
                        for (Customer c : customerService.getCustomers()) System.out.println(c);
                    } else if (custChoice == 3) {
                        System.out.print("Enter Customer ID: "); int cid = sc.nextInt();
                        Customer cust = null;
                        for (Customer c : customerService.getCustomers()) if (c.getUserId() == cid) cust = c;
                        if (cust != null) {
                            List<ProductQuantityPair> plist = new ArrayList<>();
                            while (true) {
                                System.out.print("Enter Product ID to add to order (or -1 to complete): ");
                                int pid = sc.nextInt();
                                if (pid == -1) break;
                                Product p = productService.getProductById(pid);
                                if (p != null) {
                                    System.out.print("Enter quantity: "); int qty = sc.nextInt();
                                    plist.add(new ProductQuantityPair(p, qty));
                                    p.setStockQuantity(p.getStockQuantity() - qty);
                                }
                            }
                            orderService.placeOrder(cust, plist);
                            System.out.println("Order placed!");
                        }
                    } else if (custChoice == 4) {
                        System.out.print("Enter Customer ID: "); int cid = sc.nextInt();
                        List<Order> custOrders = orderService.getOrdersByCustomerId(cid);
                        for (Order o : custOrders) System.out.print(o);
                    } else if (custChoice == 5) {
                        for (Product p : productService.getAllProducts()) System.out.println(p);
                    } else break;
                }
            } else break;
        }
        System.out.println("Exiting...");
    }
}
