
public class BankAcc
{
    String Name;
    int accountNumber;
    double balance;

// create account
    void createAccount(String Name , int number, double Balance)
    {
        this.Name=Name;
        this.accountNumber=number;
        this.balance=Balance;
    }
//deposit amount
    void deposite(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposited amount is "+amount);
    }
//withdraw amount 
    void withDraw(double amount)
    {
    if (balance >= amount)
   {
        balance = balance - amount;
        System.out.println("withdrawn amount is "+amount);
   }
    else
    {
        System.out.println("Insufficient balance. Please enter a valid amount.");
    }
    }

//check balance
    void checkBalance()
    {
        System.out.println("Account holder name is: "+Name);
        System.out.println("Account number is: "+accountNumber);
        System.out.println("current balance: "+balance);
    }
//main method
    public static void main(String args[])
    {
        BankAcc b = new BankAcc();
        b.createAccount("Harika", 12345, 10000);
        b.checkBalance();
        b.deposite(5000);
        b.withDraw(2000);
        b.checkBalance();
    }

}
