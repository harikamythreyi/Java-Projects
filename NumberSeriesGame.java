import java.util.Scanner;

public class NumberSeriesGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Guess the next number in the series: 2 4 6 8 ?");
        int answer1 = sc.nextInt();
        if (answer1 == 10) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is 10");
        }

        System.out.println("Guess the next number in the series: 1 1 2 3 5 ?");
        int answer2 = sc.nextInt();
        if (answer2 == 8) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is 8");
        }

        System.out.println("Your score is: " + score);
    }
}