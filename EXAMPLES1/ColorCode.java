import java.util.*;
public class ColorCode
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a color code (R/B/G/O/Y/W): ");
        char colorCode = sc.next().toUpperCase().charAt(0);
        String colorName = getColorName(colorCode);
        if (colorName.equals("Invalid Code")) 
        {
            System.out.println("Invalid Code");
        } 
        else 
        {
            System.out.println("Color Name: " + colorName);
        }
    }
    private static String getColorName(char code) 
    {
        switch (code) 
        {
            case 'R':
                return "Red";
            case 'B':
                return "Blue";
            case 'G':
                return "Green";
            case 'O':
                return "Orange";
            case 'Y':
                return "Yellow";
            case 'W':
                return "White";
            default:
                return "Invalid Code";
        }
    }
}
