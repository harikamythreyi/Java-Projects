import java.util.Scanner;

public class BusBooking
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int seats[] = new int[5]; // 5 seats
        int choice, seatno;

        for(int i=0; i<5; i++)
        {
            seats[i] = 0; // 0 means available
        }

        while(true)
        {
            System.out.println("\n1. Show Available Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Show Booked Seats");
            System.out.println("4. Exit");
            System.out.println("Enter choice:");
            choice = sc.nextInt();

            if(choice == 1)
            {
                System.out.println("Available Seats:");
                for(int i=0; i<5; i++)
                {
                    if(seats[i] == 0)
                    {
                        System.out.println("Seat " + (i+1));
                    }
                }
            }

            else if(choice == 2)
            {
                System.out.println("Enter seat number to book (1-5):");
                seatno = sc.nextInt();

                if(seats[seatno-1] == 0)
                {
                    seats[seatno-1] = 1;
                    System.out.println("Seat Booked Successfully");
                }
                else
                {
                    System.out.println("Seat Already Booked");
                }
            }

            else if(choice == 3)
            {
                System.out.println("Booked Seats:");
                for(int i=0; i<5; i++)
                {
                    if(seats[i] == 1)
                    {
                        System.out.println("Seat " + (i+1));
                    }
                }
            }

            else if(choice == 4)
            {
                System.out.println("Thank You");
                break;
            }
        }
    }
}