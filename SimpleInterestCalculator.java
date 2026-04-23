class Interest
{
    int p= 1000;
    int r= 5;
    int t= 2;
    void calculateSimpleInterest()
    {
        int Interest = (p * r * t) / 100;
        System.out.println("Simple Interest: " + Interest);
    }
}

public class SimpleInterestCalculator 
{
    public static void main(String[] args) 
    {
        Interest i = new Interest();
        i.calculateSimpleInterest();
    }
}