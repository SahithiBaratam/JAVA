import java.util.Scanner;
public class SearchArray1 
{
    public static void main(String[] args) 
    {
        int[] myArray = new int[5];
        int result = -1,count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers for array: ");
        for(int j=0;j<5;j++)
        {
            myArray[j] = sc.nextInt();
        }
        System.out.print("Enter a number to search in the array: ");
        int no = sc.nextInt();
        for(int i=0;i< myArray.length;i++)
        {
            if(myArray[i] == no)
            {
                System.out.println("The number " + no + " is present at index " + i);
            }
            if(myArray[i] != no)
            {
                count++;
            }
            if(count == 5)
            {
                System.out.println(result);
            }
        }
    }
}
