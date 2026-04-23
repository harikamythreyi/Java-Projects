import java.util.Scanner;

public class ElectricityBill
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int units;
        double bill;

        System.out.println("Enter number of units:");
        units = sc.nextInt();

        if(units <= 100)
        {
            bill = units * 2;
        }
        else if(units <= 200)
        {
            bill = units * 3;
        }
        else
        {
            bill = units * 5;
        }

        System.out.println("Electricity Bill = ₹ " + bill);
    }
}