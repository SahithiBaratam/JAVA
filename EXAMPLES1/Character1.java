import java.util.*;
public class Character1
{
    System.out.println("Enter a character: ");
    Scanner sc = new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if(Character.isLetter(ch))
    {
        System.out.println("ALPHABET");
    }
    else if(Charcater.isDigit(ch))
    {
        System.out.println("NUMBER");
    }
    else
    {
        System.out.println("SPECIAL CHARACTERS");
    }
}