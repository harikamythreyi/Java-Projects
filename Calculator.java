import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a, b, choice;

        while(true)
        {
            System.out.println("\n1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            System.out.println("Enter choice:");
            choice = sc.nextInt();

            if(choice == 5)
            {
                System.out.println("Calculator Closed");
                break;
            }

            System.out.println("Enter first number:");
            a = sc.nextInt();

            System.out.println("Enter second number:");
            b = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Result = " + (a+b));
                    break;

                case 2:
                    System.out.println("Result = " + (a-b));
                    break;

                case 3:
                    System.out.println("Result = " + (a*b));
                    break;

                case 4:
                    System.out.println("Result = " + (a/b));
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}