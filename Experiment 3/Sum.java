/* Wap to calculate the sum of all the elements in the array */
import java.util.*;
class Sum
{
   public static void main(String args[])
   {
      int no,i,j,sum;
      System.out.println("Enter how many numbers to store in the array");
      Scanner sc = new Scanner(System.in);
      no = sc.nextInt();
      int arr[] = new int[no];
      System.out.println("Enter the numbers");
      for(i=0;i<no;i++)
      {
         arr[i] = sc.nextInt();
      }
      System.out.print("The sum is:");
      sum = 0;
      for(i=0;i<no;i++)
      {
          sum = sum + arr[i];
      }
      System.out.println(sum);
   }
}      