import java.util.Scanner;
public class SearchArray 
{
    public static void main(String[] args) 
    {
        int[] myArray = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers for array: ");
        for(int j=0;j<5;j++)
        {
            myArray[j] = sc.nextInt();
        }
        System.out.print("Enter a number to search in the array: ");
        int no = sc.nextInt();
        int result = searchArray(myArray, no);
        if (result != -1) 
        {
            System.out.println("The number " + no + " is present at index " + result );
        } 
        else 
        {
            System.out.println("The number " + no + " is not present in the array");
        }
    }
    private static int searchArray(int[] arr, int target) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target) 
            {
                return i; 
            }
        }
        return -1; 
    }
}
