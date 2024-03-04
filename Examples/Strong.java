import java.util.*;
class Strong
{
   public static void main(String args[])
   {
      int no,fact,d,sum,s,i;
      System.out.println("Enter a number");
      Scanner sc = new Scanner(System.in);
      no = sc.nextInt();
      s = no;
      while(no>0)
      {
         fact = 1;
         sum = 0;
         d = no % 10;
         for(i=1;i<=d;i++)
         {
            fact = fact*i;
            sum = sum + fact;
         }
         no = no/10;
      }
      if(s == sum)
      {
         System.out.println("It is a strong number");
      }
      else
      {
         System.out.println("It is not a prime number");
      }
   }
}