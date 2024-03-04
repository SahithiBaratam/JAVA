/* Wap for multiplication of two matrices  */
import java.util.*;
class Multiplication
{
   public static void main(String args[])
   {
      int i,j,k,r1,r2,c1,c2;
      int arr1[][] = new int[3][3];
      int arr2[][] = new int[3][3];
      int arr3[][] = new int[3][3];
      System.out.println("Enter the number of rows for arr1");
      Scanner sc = new Scanner(System.in);
      r1 = sc.nextInt();
      System.out.println("Enter the number of columns for arr1");
      c1 = sc.nextInt();
      System.out.println("Enter the number of rows for arr2");
      r2 = sc.nextInt();
      System.out.println("Enter the number of columns for arr2");
      c2 = sc.nextInt();
      if(c1 == r2)
      {
         System.out.println("Enter the values for arr1");
         for(i=0;i<r1;i++)
         {
            for(j=0;j<c1;j++)
            {
               arr1[i][j] = sc.nextInt();
            }
         }
         System.out.println("Enter the values for arr2");
         for(i=0;i<r2;i++)
         {
            for(j=0;j<c2;j++)
            {
               arr2[i][j] = sc.nextInt();
            }
         }
          for(i=0;i<r2;i++)
          {
             for(j=0;j<c1;j++)
             {
                arr3[i][j]=0;
                for(k=0;k<c1;k++)
                {
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
             }
          }
          System.out.println("Multiplication of two matrices is :");
          for(i=0;i<r2;i++)
          {
             for(j=0;j<c1;j++)
             {
                 System.out.print(arr3[i][j] + " ");
             }
             System.out.println(" ");
          }
      }
      else
      {
          System.out.println("Matrix multiplication is not possible");
      }
   }
}
      
             
