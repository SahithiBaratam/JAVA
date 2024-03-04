import java.util.*;
class Prime
{
   public static void main(String args[])
   {
       int i,count=0,no;
       System.out.println("Enter a number");
       Scanner sc = new Scanner(System.in);
       no = sc.nextInt();
       for(i=1;i<=no;i++)
       {
          if(no % i == 0)
          {
              count = count+1;
          }
       }
       if(count == 2)
       {
           System.out.println("It is a prime number");
       }
       else
       {
           System.out.println("It is not prime number");
       }
    }
}