import java.util.*;
class Account {
    private int accountNumber;
    private String holderName;
    private double balance;
    private ArrayList<String> transactionHistory;
    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }
    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance!");
        }
        balance -= amount;
        transactionHistory.add("Withdrawn: ₹" + amount);
    }
}

public class ATMWebsite {
    private static HashMap<Integer, Account> accounts = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("\n--- ATM MENU ---");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Check Balance");
                System.out.println("5. Transaction History");
                System.out.println("6. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        depositMoney();
                        break;
                    case 3:
                        withdrawMoney();
                        break;
                    case 4:
                        checkBalance();
                        break;
                    case 5:
                        viewTransactions();
                        break;
                    case 6:
                        System.out.println("Thank you!");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter numbers only.");
                sc.nextLine(); 
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); 

        if (accounts.containsKey(accNo)) {
            System.out.println("Account already exists!");
            return;
        }

        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();

        Account acc = new Account(accNo, name);
        accounts.put(accNo, acc);

        System.out.println("Account created successfully!");
    }

    private static void depositMoney() {
        Account acc = getAccount();
        if (acc != null) {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid amount!");
                return;
            }

            acc.deposit(amount);
            System.out.println("Deposit successful!");
        }
    }

    private static void withdrawMoney() {
        Account acc = getAccount();
        if (acc != null) {
            try {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                if (amount <= 0) {
                    System.out.println("Invalid amount!");
                    return;
                }

                acc.withdraw(amount);
                System.out.println("Withdrawal successful!");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void checkBalance() {
        Account acc = getAccount();
        if (acc != null) {
            System.out.println("Balance: ₹" + acc.getBalance());
        }
    }

    private static void viewTransactions() {
        Account acc = getAccount();
        if (acc != null) {
            System.out.println("Transaction History:");
            for (String t : acc.getTransactionHistory()) {
                System.out.println(t);
            }
        }
    }

    private static Account getAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        if (!accounts.containsKey(accNo)) {
            System.out.println("Account not found!");
            return null;
        }

        return accounts.get(accNo);
    }
}