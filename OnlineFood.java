import java.util.*;
// Functional Interface (only one abstract method)
interface BillCalculator {
    double calculate(double amount);
}

public class OnlineFood {
    public static void main(String[] args) {

        // List of order amounts
        List<Double> orders = Arrays.asList(250.0, 500.0, 1000.0, 150.0);

        // Lambda for GST (5%)
        BillCalculator gst = amount -> amount + (amount * 0.05);

        // Lambda for Discount (10%)
        BillCalculator discount = amount -> amount - (amount * 0.10);

        // Lambda for Delivery Charge (fixed ₹50 if amount < 500)
        BillCalculator delivery = amount -> {
            if (amount < 500) {
                return amount + 50;
            } else {
                return amount;
            }
        };

        // Lambda for Service Charge (2%)
        BillCalculator service = amount -> amount + (amount * 0.02);

        // Process each order using Lambda (forEach)
        orders.forEach(order -> {
            

            double afterGST = gst.calculate(order);
            double afterDiscount = discount.calculate(afterGST);
            double afterDelivery = delivery.calculate(afterDiscount);
            double finalAmount = service.calculate(afterDelivery);

            // Print Bill
              System.out.println("Original Amount  : " + order);
            System.out.println("After GST (5%)   : " + afterGST);
            System.out.println("After Discount   : " + afterDiscount);
            System.out.println("After Delivery   : " + afterDelivery);
            System.out.println("Final Bill       : " + finalAmount);
            System.out.println("-----------------------------");
        });
    }
}