/* wap to deposit,withdrawl and check balace in the bank account  */
import java.util.*;
class Bank 
{
    int accno;
    String name;
    String ifscCode;
    double balance;
    void details() 
    {
        Scanner sc = new Scanner(System.in);
        accno = sc.nextInt();
        name = sc.next();
        ifscCode = sc.next();
        balance = 0.0;
    }
    void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
            checkBalance();
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
     }
     void withdraw(double amount) 
     {
        if (balance < 1000) 
        {
            System.out.println("You cannot withdraw. Balance is less than 1000.");
        } 
        else if (amount > 15000) 
        {
            System.out.println("You have exceeded the maximum withdrawal amount.");
        } 
        else if (amount % 100 != 0 || amount % 500 != 0) 
        {
            System.out.println("Withdrawal amount must be in denominations of 100 or 500.");
        } 
        else  
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            checkBalance();
        }
    }
    void checkBalance() 
    {
        System.out.println("Account Balance: " + balance);
    }
}
class Bank1 
{
    public static void main(String[] args) 
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter account number");
        System.out.println("Enter name");
        System.out.println("Enter IFSC code");
        Bank obj = new Bank();
        obj.details();
        while (true) 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc1.nextInt();
            switch (ch) 
            {
                case 1:
                {
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc1.nextDouble();
                    obj.deposit(depositAmount);
                    break;
                 }
                case 2:
                {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc1.nextDouble();
                    obj.withdraw(withdrawAmount);
                    break;
                }
                case 3:
                {
                    obj.checkBalance();
                    break;
                 }
                case 4:
                {
                    System.out.println("Exiting...");
                    sc1.close();
                    return;
                }
                default:
                {
                    System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }
}
