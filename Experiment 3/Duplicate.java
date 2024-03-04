/* Wap to duplicate the array elements */
import java.util.*;
class Duplicate
{
   public static void main(String args[])
   {
      int i,j;
      Scanner sc = new Scanner(System.in);
      int arr1[] = new int[6];
      System.out.println("Enter six numbers");
      for(i=0;i<6;i++)
      {
         arr1[i] = sc.nextInt();
      }
      int arr2[] = arr1;
      System.out.println("The numbers are");
      for(i=0;i<6;i++)   
      { 
         System.out.print(arr2[i] + ",");
      }
   }
}
