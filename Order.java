import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<Product> orderedProducts;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderedProducts = new ArrayList<>();
    }

    public String getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public List<Product> getOrderedProducts() { return orderedProducts; }

    public void addProductToOrder(Product product) {
        orderedProducts.add(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customer=" + customer +
                ", orderedProducts=" + orderedProducts +
                '}';
    }
}