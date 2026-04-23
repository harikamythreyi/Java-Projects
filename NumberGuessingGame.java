import java.util.*;
public class NumberGuessingGame
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Random rand= new Random();
        int number=rand.nextInt(100)+1;
        int guess=0;
        int attempts=0;
        while(guess!=number)
        {
            System.out.println("enter your guess:");
            guess=sc.nextInt();
            attempts++;
            if(guess<number)
            {
                System.out.println("too low try again");
            }
            else if(guess>number)
            {
                System.out.println("too high try again");
            }
            else
            {
                System.out.println(number+" ! you guessed it right in " + attempts +  " attempts");
            }
    

        }
    }
}