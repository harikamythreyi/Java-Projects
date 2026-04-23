import java.util.*;

class MetroBooking 
{

    String passengerName;
    String source;
    String destination;
    String date;
    int Distance;
    int totalFare;

    void getDetails() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter passenger name:");
        passengerName = sc.nextLine();

        System.out.println("Enter the source station:");
        source = sc.nextLine();

        System.out.println("Enter the destination station:");
        destination = sc.nextLine();

        System.out.println("Enter the date of travel (dd/mm/yyyy):");
        date = sc.nextLine();

        System.out.println("Enter the distance between stations:");
        Distance = sc.nextInt();
    }

    void calculateFare()
     {
        int farePerKm = 5;
        totalFare = Distance * farePerKm;
    }

    void displayDetails() {
        System.out.println("-----------Metro Ticket Details-----------");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Date of Travel: " + date);
        System.out.println("Distance: " + Distance + " km");
        System.out.println("Total Fare: " + totalFare);
        System.out.println("-----------------------------------------");
    }
}

public class MetroBookingSystem {
    public static void main(String[] args)
     {

        MetroBooking booking = new MetroBooking();

        booking.getDetails();
        booking.calculateFare();
        booking.displayDetails();
    }
}