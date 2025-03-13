// Main class to demonstrate E-commerce Platform relationships
public class ECommerceSystem {

    public static void main(String[] args) {

        // Creating a customer
        Customer customer = new Customer("Ankush Sharma");

        // Creating products
        Product product1 = new Product("Laptop", 80000);
        Product product2 = new Product("Smartphone", 50000);

        // Creating an order and adding products
        Order order = new Order(243, customer);
        order.addProduct(product1);
        order.addProduct(product2);

        // Display order details
        order.displayOrderDetails();
    }
}

// Class representing a Customer
class Customer {

    private String name;

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // Method to get customer name
    public String getName() {
        return name;
    }
}

// Class representing a Product
class Product {

    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to get product details
    public String getProductDetails() {
        return name + " ($" + price + ")";
    }
}

// Class representing an Order (Aggregation with Products)
class Order {

    private int orderId;
    private Customer customer;
    private Product product1;
    private Product product2;

    // Constructor
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    // Method to add products to the order
    public void addProduct(Product product) {
        if (product1 == null) {
            product1 = product;
        } else if (product2 == null) {
            product2 = product;
        }
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());

        if (product1 != null) {
            System.out.println("  Product: " + product1.getProductDetails());
        }

        if (product2 != null) {
            System.out.println("  Product: " + product2.getProductDetails());
        }
    }
}
