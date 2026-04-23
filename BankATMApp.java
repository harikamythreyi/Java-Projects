import java.util.*;
interface Payment
{
    void pay(double amount);
}

//PAYMENT CREDENTIALS
class CreditCardPayment implements Payment
{
public void pay(double amount)
{
    System.out.println("Paid Rupees" + amount + " using Credit Card");
}
}

class DebitCardPayment implements Payment
{
    public void pay(double amount)

{
    System.out.println("Paid Rupees"+ amount+ "using Debit Card");
}
}

class UPIPayment implements Payment
{
    public void pay(double amount)
{
    System.out.println("Paid Rupees" + amount + "using UPI Payment");
}
}

//PARENT CLASS

class User 
{

    String name;
    double balance;
    User(String name ,double balance)
    {
        this.name=  name;
        this.balance =balance;
    }
    void display()
    {
        System.out.println("User :" +name);
        System.out.println("Balance " +balance);
    }
}

//CHILD CLASS

class Customer extends User 
{

    Customer(String name, double balance)
    {
        super (name, balance);
    }


//DEPOSIT
    void deposit(double amount)
    {

        balance += amount;
        System.out.println("Deposited Amount " +amount);
    }

//WITHDRAW
void withdraw( double amount)
{
    if(amount <= balance)
    {
        balance -= amount;
        System.out.println("WithDrwan Amount" +amount);
    }
    else
    {
        System.out.println("InSufficient Balance");
    }
}


//POLYMORPHISM

void makePayment(Payment p , double amount)
{
    if (amount <= balance)
    {
        balance -= amount;
        p.pay(amount);
    }
    else
    {
        System.out.println("Payment Failed : Low Balance");
    }
}
}

//MAINCLASS

public class BankATMApp
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner (System.in);
        Customer c= new Customer("HARIKA MYTHREYI", 100000);

        int choice ;

        do
        {
            System.out.println("---------BANK MENU---------");
            System.out.println("1. Display Details ");
            System.out.println(" 2. DEposit ");
            System.out.println(" 3. WitDraw ");
            System.out.println(" 4. MakePayment  ");
            System.out.println(" 5. Exit ");
            System.out.println(" Enter choice");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    c.display();
                    break;

                    case 2: 
                        System.out.println("Enter Amount: ");
                        double dep = sc.nextDouble();
                        c.deposit(dep);
                        break;

                        case 3:
                            System.out.println("Enter Amount: ");
                            double wd = sc.nextDouble();
                            c.withdraw(wd);
                            break;

                            case 4:
                                System.out.println(" Select Payment Method");
                                System.out.println(" 1. Credit Card");
                                System.out.println(" 2. Debit Card");
                                System.out.println(" 3. UPI payment");

                                int payChoice = sc.nextInt();
                                System.out.println(" Enter amount");
                                double amt = sc.nextDouble();

                                Payment p= null;

                                if(payChoice ==1)
                                p =  new CreditCardPayment();
                                else if(payChoice== 2)
                                p= new DebitCardPayment();
                                else if(payChoice == 3)
                                p= new UPIPayment();
                                else
                                {
                                    System.out.println(" Invalid Option");
                                    break;
                                }
                                c.makePayment(p,amt);
                                break;

                                case 5:
                                    System.out.println(" Thank You");
                                    break;

                                    default:
                                        System.out.println(" Invalid Choice");

            }
           

        }
         while(choice!=5);
            sc.close();
    }
}
