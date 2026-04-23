import java.util.Scanner;

public class SmartNumberseriesAnalyzer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        boolean ascending = true;
        boolean descending = true;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i = 1; i < n; i++)
        {
            if (arr[i] < arr[i - 1])
            {
                ascending = false;
            }

            if (arr[i] > arr[i - 1])
            {
                descending = false;
            }
        }

        System.out.println("Sum of series: " + sum);

        if (ascending)
        {
            System.out.println("The series is in ascending order.");
        }
        else if (descending)
        {
            System.out.println("The series is in descending order.");
        }
        else
        {
            System.out.println("The series is unordered.");
        }
    }
}