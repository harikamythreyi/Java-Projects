class TrainTicket {
    int ticketId;
    String passengerName;
    String trainName;
    boolean isBooked = false;

    void bookTicket() {
        if (isBooked == false) {
            isBooked = true;
            System.out.println("Ticket Booked Successfully");
        } else {
            System.out.println("Ticket already booked");
        }
    }

    void cancelTicket() {
        if (isBooked == true) {
            isBooked = false;
            System.out.println("Ticket Cancelled Successfully");
        } else {
            System.out.println("Ticket was not booked");
        }
    }

    void displayTicket() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Train Name: " + trainName);
        System.out.println("Booked Status: " + isBooked);
    }
}

public class TrainBookingSystem {
    public static void main(String[] args) {

        TrainTicket t1 = new TrainTicket();

        t1.ticketId = 377;
        t1.passengerName = "Harika";
        t1.trainName = "Superfast Express Train";

        t1.displayTicket();
        t1.bookTicket();
        t1.displayTicket();
        t1.cancelTicket();
        t1.displayTicket();
    }
}