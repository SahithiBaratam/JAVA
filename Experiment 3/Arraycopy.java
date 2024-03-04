/* Wap for copying the array */
import java.util.*;
class Arraycopy
{
    public static void main(String args[])
    {
       int i,no;
       System.out.println("Enter how many numbers to store in the array");
       Scanner sc = new Scanner(System.in);
       no = sc.nextInt();
       int arr1[] = new int[no];
       System.out.println("Enter the numbers");
       for(i=0;i<no;i++)
       {
          arr1[i] = sc.nextInt();
       }
       int arr3[] = new int[5];
       int arr2[] = new int[arr1.length];
       System.arraycopy(arr1,0,arr2,0,arr1.length);
       System.out.println("arr2 = " +Arrays.toString(arr2));
       System.arraycopy(arr1,2,arr3,1,2);
       System.out.println("arr3 = " +Arrays.toString(arr3));
    }
}