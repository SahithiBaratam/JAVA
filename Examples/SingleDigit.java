import java.util.Scanner;
public class SingleDigit
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        while (no > 9) 
        {
            int temp = 0;
            while (no > 0) 
            {
                temp += no % 10;
                no /= 10;
            }

            no = temp;
        }

        System.out.println("Sum of digits until a single digit: " + no);
    }
}
