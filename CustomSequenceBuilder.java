import java.util.Scanner;

public class CustomSequenceBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number:");
        int start = sc.nextInt();

        System.out.println("Enter common difference:");
        int diff = sc.nextInt();

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        System.out.println("Custom sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print((start + i * diff) + " ");
        }
    }
}