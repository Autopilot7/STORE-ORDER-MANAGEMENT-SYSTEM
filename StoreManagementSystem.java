import java.util.HashMap;
import java.util.Map;

public class StoreManagementSystem {
    private Map<String, Product> products;
    private Map<String, Customer> customers;

    public StoreManagementSystem() {
        products = new HashMap<>();
        customers = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void removeProduct(String productId) {
        products.remove(productId);
    }

    public void registerCustomer(Customer customer) {
        customers.put(customer.getUsername(), customer);
    }

    public void placeOrder(Order order) {
        // Further implementation would be needed here for real-world applications
    }

    public Product getProductById(String productId) {
        return products.get(productId);
    }

    public Customer getCustomerByUsername(String username) {
        return customers.get(username);
    }

    public void printAllProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public void printAllCustomers() {
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }

    // Additional functionalities can be added here
}
