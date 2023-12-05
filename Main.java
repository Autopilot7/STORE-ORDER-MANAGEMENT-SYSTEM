

public class Main {
    public static void main(String[] args) {
        StoreManagementSystem sms = new StoreManagementSystem();

        // Add products
        Product product1 = new Product("P001", "Laptop", 50000, "Electronics");
        Product product2 = new Product("P002", "Smartphone", 30000, "Electronics");
        sms.addProduct(product1);
        sms.addProduct(product2);

        // Register customers
        Customer customer1 = new Customer("john_doe", "password123", "John Doe", "123456789");
        sms.registerCustomer(customer1);

        // Place an order
        Order order1 = new Order("O001", customer1);
        order1.addProductToOrder(product1);
        order1.addProductToOrder(product2);
        sms.placeOrder(order1);

        // Print details
        sms.printAllProducts();
        sms.printAllCustomers();

        // You can add more functionalities and test them here
    }
}
