/* Wap for sorting the array elements in ascending order */
import java.util.*;
class Ascending
{
    public static void main(String args[])
    {
       int i,temp,j;
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[5];
       System.out.println("Enter five numbers");
       for(i=0;i<5;i++)
       {
           arr[i] = sc.nextInt();
       }
       for(i=0;i<5;i++)
       {
          for(j=i+1;j<5;j++)
          {
             if(arr[i] > arr[j])
             {
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
          }
       }
       System.out.println("Ascending oder is :");
       for(i=0;i<5;i++)
       {
          System.out.print(arr[i] + ",");
       }
    }
}
          