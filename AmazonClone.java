import java.util.*;

class Product {
    int id;
    String name;
    double price;
    double rating;

    // Constructor
    public Product(int id, String name, double price, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    // toString for printing
    public String toString() {
        return id + " | " + name + " | ₹" + price + " | ⭐" + rating;
    }
}

public class AmazonClone {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 70000, 4.5),
                new Product(2, "Mobile", 20000, 4.2),
                new Product(3, "Headphones", 3000, 4.0),
                new Product(4, "Smart Watch", 5000, 4.3),
                new Product(5, "Tablet", 25000, 4.1)
        );

        // 1. Filter
        System.out.println("Expensive Products:");
        products.stream()
                .filter(p -> p.price > 20000)
                .forEach(System.out::println);

        // 2. Map (Discount)
        System.out.println("\nAfter 10% Discount:");
        products.stream()
                .map(p -> new Product(p.id, p.name, p.price * 0.9, p.rating))
                .forEach(System.out::println);

        // 3. Reduce (Total)
        double total = products.stream()
                .map(p -> p.price)
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("\nTotal Inventory Value: ₹" + total);

        // 4. Sort
        System.out.println("\nTop Rated Products:");
        products.stream()
                .sorted((p1, p2) -> Double.compare(p2.rating, p1.rating))
                .forEach(System.out::println);

        // 5. Map (Names)
        System.out.println("\nProduct Names:");
        products.stream()
                .map(p -> p.name)
                .forEach(System.out::println);

        // 6. Filter + Map
        System.out.println("\nPremium Products:");
        products.stream()
                .filter(p -> p.price > 25000)
                .map(p -> p.name)
                .forEach(System.out::println);
    }
}