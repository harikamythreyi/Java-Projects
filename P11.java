import java.util.*;

// Functional Interface
interface BillCalculator {
    double calculate(double amount);
}

public class P11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get number of rooms
        System.out.print("Enter number of rooms: ");
        int n = sc.nextInt();

        List<Double> rooms = new ArrayList<>();

        // Taking room charges as input
        System.out.println("Enter room charges:");
        for (int i = 0; i < n; i++) {
            rooms.add(sc.nextDouble());
        }

        // Lambda for Tax (12%)
        BillCalculator tax = amount -> amount + (amount * 0.12);

        // Lambda for Discount (15%)
        BillCalculator discount = amount -> amount - (amount * 0.15);

        // Lambda for Service Charge (₹200 if amount < 3000)
        BillCalculator service = amount -> (amount < 3000) ? amount + 200 : amount;

        // Lambda for Luxury Charge (5% if amount > 4000)
        BillCalculator luxury = amount -> {
            if (amount > 4000) {
                return amount + (amount * 0.05);
            } else {
                return amount;
            }
        };

        double totalRevenue = 0;
        int count = 1;

        System.out.println("\n===== HOTEL BILLING SYSTEM =====");

        for (double room : rooms) {

            double afterTax = tax.calculate(room);
            double afterDiscount = discount.calculate(afterTax);
            double afterService = service.calculate(afterDiscount);
            double finalAmount = luxury.calculate(afterService);

            System.out.println("\nRoom " + count++);
            System.out.println("Room Charge     : " + room);
            System.out.println("After Tax       : " + afterTax);
            System.out.println("After Discount  : " + afterDiscount);
            System.out.println("After Service   : " + afterService);
            System.out.println("Final Bill      : " + finalAmount);

            totalRevenue += finalAmount;
        }

        System.out.println("\n===============================");
        System.out.println("Total Revenue: " + totalRevenue);

        sc.close();
    }
}