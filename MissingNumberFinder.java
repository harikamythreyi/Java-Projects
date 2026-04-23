import java.util.Scanner;

public class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total count including missing number:");
        int n = sc.nextInt();

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        System.out.println("Enter " + (n - 1) + " numbers:");
        for (int i = 0; i < n - 1; i++) {
            actualSum += sc.nextInt();
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number is: " + missingNumber);
    }
}