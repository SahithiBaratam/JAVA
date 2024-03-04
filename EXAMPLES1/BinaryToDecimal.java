import java.util.*;
import java.util.Scanner;
public class BinaryToDecimal 
{
    public static void main(String[] args)
     {
        String b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        b = sc.nextLine();
        try 
        {
            int d = Integer.parseInt(b, 2);
            System.out.println("Decimal equivalent: " + d);
        }
        catch (NumberFormatException e) 
        {
            System.out.println(e);
        }
    }
}
