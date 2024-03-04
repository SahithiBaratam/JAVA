public class NumberFormatException
{
    public static void main(String args[])
    {
        try
        {
            String s="123";
            int i=Integer.parseInt(s);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}