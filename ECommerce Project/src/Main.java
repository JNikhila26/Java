import java.util.ArrayList;
import java.util.List;
class InvalidPaymentException extends Exception {
    public InvalidPaymentException(String message) {
        super(message);
    }
}
public class Main {

    public static void main(String[] args) throws InvalidPaymentException {
        // Create some sample customers
        Customer customer1 = new Customer(1, "Nikhila J", "nikki.j@gmail.com");
        Customer customer2 = new Customer(2,"Anjali T","anjut99@gmail.com");

        // Create some sample products
        Product product1 = new Product(101, "Mac Air", 999.99, 50);
        Product product2 = new Product(102, "iPhone 14", 499.99, 100);
        Product product3 = new Product(103, "iPhone 15",750,25);

        // Create an order with the sample customer and products
        List<Product> orderProducts = new ArrayList<>();
        orderProducts.add(product1);
        orderProducts.add(product2);
        orderProducts.add(product3);

        Order order1 = new Order(1001, customer1, orderProducts);
        Order order2 = new Order(1002, customer2, orderProducts);

        // Display information about the order
        System.out.println("Order Details:");
        System.out.println(order1);
        System.out.println(order2);

        // Perform operations, e.g., update quantity available for a product
        product1.setQuantityAvailable(40);
        product3.setPrice(699.99);

        // Display updated product information
        System.out.println("\nUpdated Product Information:");
        System.out.println(product1);
        System.out.println(product3);

        // Simulate a payment for the order
        Payment payment1 = new Payment(2001, order1, order1.getTotalAmount());
        Payment payment2 = new Payment(2002, order2, order2.getTotalAmount());

        // Display information about the payment
        System.out.println("\nPayment Details:");
        System.out.println(payment1);
        System.out.println(payment2);

    }
}