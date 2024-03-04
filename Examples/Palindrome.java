import java.util.*;
class Palindrome
{
   public static void main(String args[])
   {
      int p,n,d,s=0;
      System.out.println("Enter a number:");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      p = n;
      while(n>0)
      {
         d = n%10;
         s = (s*10)+d;
         n = n/10;
      }
      if ( p == s)
      {
         System.out.println("It is a palindrome number");
      }
      else
      {
          System.out.println("It is not a palindrome number");
      }
    }
}
 