import java.util.Scanner;

public class Restaurant
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        int total = 0;

        do {
            System.out.println("--- Restaurant Menu ---");
            System.out.println("1. Pizza - 200");
            System.out.println("2. Burger - 100");
            System.out.println("3. Pasta - 150");
            System.out.println("4. Show Total Bill");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice)
             {
                case 1:
                    total = total + 200;
                    System.out.println("Pizza added");
                    break;

                case 2:
                    total = total + 100;
                    System.out.println("Burger added");
                    break;

                case 3:
                    total = total + 150;
                    System.out.println("Pasta added");
                    break;

                case 4:
                    System.out.println("Total Bill = " + total);
                    break;

                case 5:
                    System.out.println("Thank you for visiting");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}