class Bank 
{
    protected double balance;
    public Bank(double balance) 
    {
        this.balance = balance;
    }
    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) 
   {
        System.out.println("Withdrawal not supported by the base class.");
    }
}
class SBI extends Bank 
{
    public SBI(double balance) 
    {
        super(balance);
    }
    public void withdraw(double amount) 
   {
        if (balance - amount >= 1000) 
        {
            balance -= amount;
            System.out.println("SBI: Withdrawn: " + amount);
        }
        else 
        {
            System.out.println("SBI: Insufficient balance");
        }
    }
}
class ICICI extends Bank 
{
    public ICICI(double balance) 
    {
        super(balance);
    }
    public void withdraw(double amount) 
    {
        if (balance - amount >= 1000) 
        {
            balance -= amount;
            System.out.println("ICICI: Withdrawn: " + amount);
        } 
        else 
        {
            System.out.println("ICICI: Insufficient balance");
        }
    }
}
class AXIS extends Bank 
{
    public AXIS(double balance) 
    {
        super(balance);
    }
    public void withdraw(double amount) 
    {
        if (balance - amount >= 1000) 
        {
            balance -= amount;
            System.out.println("AXIS: Withdrawn: " + amount);
        } 
        else 
        {
            System.out.println("AXIS: Insufficient balance");
        }
    }
}
public class Bankk 
{
    public static void main(String[] args) 
    {
        Bank sbiAccount = new SBI(2000);
        Bank iciciAccount = new ICICI(1500);
        Bank axisAccount = new AXIS(800);

        sbiAccount.deposit(500);
        sbiAccount.withdraw(700);

        iciciAccount.deposit(300);
        iciciAccount.withdraw(900);

        axisAccount.deposit(200);
        axisAccount.withdraw(600);
    }
}