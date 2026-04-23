interface Payment
{
    void pay();
}
class GPay implements Payment
{
    public void pay()
    {
        System.out.println("GPay payment");
    }
}
class PhonePe implements Payment
{
    public void pay()
    {
        System.out.println("PhonePe payment");
    }
}

public class PaymentExample
{
    public static void main(String args[])
    {
        Payment p;
        p = new GPay();
        p.pay();
        p = new PhonePe();
        p.pay();

    }
}