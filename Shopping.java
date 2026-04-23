import java.util.Scanner;
public class Shopping
{
    public static void  main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String products[] = {"Milk", "Bread", "Eggs", "Butter", "Cheese"};
        double prices[] = {20, 40, 10, 50, 100};
        int choice;
        double total = 0;

        System.out.println("Products:");
        for(int i=0; i<products.length; i++)
        {
            System.out.println((i+1) + ". " + products[i] + " - Rs. " + prices[i]);
        }
        do
        {
            System.out.println("Enter product number to add to cart (0 to checkout):");
            choice = sc.nextInt();
            if(choice > 0 && choice <= products.length)
            {
                total += prices[choice - 1];
                System.out.println(products[choice - 1] + " added to cart. Total: Rs. " + total);
            }
            else if(choice != 0)
            {
                System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 0);
        System.out.println("Checkout complete. Total amount: Rs. " + total);
        sc.close();


    }
}