/* wap for printing the jagged array  */
import java.util.*;
class Jaggedarray
{
   public static void main(String args[])
   {
      int arr[][] = new int[3][];
      arr[0] = new int[3];
      arr[1] = new int[2];
      arr[2] = new int[4];
      int i,j;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the numbers");
      for(i=0;i<arr.length;i++)
      {
         for(j=0;j<arr[i].length;j++)
         {
             arr[i][j] = sc.nextInt();
         }
      }
      System.out.println("The jagged array is:");
      for(i=0;i<arr.length;i++)
      {
         for(j=0;j<arr[i].length;j++)
         {
             System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
   }
}