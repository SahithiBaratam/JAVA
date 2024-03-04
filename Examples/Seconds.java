import java.util.*;
public class Seconds
{
    public static void main(String[] args)
    {
        float s,m,h;
        System.out.println("Enter the seconds: ");
        Scanner sc = new Scanner(System.in);
        s=sc.nextFloat();
        m=(s/60);
        h=(s/3600);
        System.out.println(s+ " Seconds is equal to " + m + " minutes");
        System.out.println(s+ " Seconds is equal to " + h + " hours");
    }
}