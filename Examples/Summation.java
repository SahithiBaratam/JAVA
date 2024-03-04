import java.util.*;
public class Summation
{
    public static void main(String args[])
    {
        int sum=0,no,d;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        while(no > 0)
        {
            d=no%10;
            sum = sum + d;
            no = no/10;
        }
        System.out.println("Sum of the given number is : " + sum);
    }
}