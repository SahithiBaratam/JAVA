import java.util.*;
class Secondlarge
{
    public static void  main(String args[])
    {
       int i,no,j,temp;
       System.out.println("Enter how many numbers to store in the array");
       Scanner sc = new Scanner(System.in);
       no = sc.nextInt();
       int arr[] = new int[no];
       System.out.println("Enter the numbers");
       for(i=0;i<no;i++)
       {
          arr[i] = sc.nextInt();
       }
       for(i=0;i<no;i++)
       {
          for(j=i+1;j<no;j++)
          {
              if(arr[i]>arr[j])
              {
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
       }
       
       System.out.println("The second largest element is : " +arr[no-2]);
   }
}    
          
       
       