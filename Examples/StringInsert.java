import java.lang.*;
public class StringInsert
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(2,"str");
        System.out.println(sb.toString());
    }
}