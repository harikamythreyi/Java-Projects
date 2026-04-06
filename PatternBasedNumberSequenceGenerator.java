import java.util.Scanner;

public class PatternBasedNumberSequenceGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        System.out.println("Generated sequence:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}