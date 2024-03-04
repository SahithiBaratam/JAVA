import java.util.Scanner;
public class ParseInteger 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String st = sc.nextLine();

        try 
        {
            int no = Integer.parseInt(st);
            int sq = no * no;
            System.out.println("Square of the entered number: " + sq);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}
