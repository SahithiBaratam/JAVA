public class Arithmetic
{
    public static void main(String args[])
    {
        try
        {
            int data=20/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Can't divide by zero");
        }
        finally
        {
            System.out.println("Rest of the code");
        }
    }
}