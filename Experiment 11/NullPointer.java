public class NullPointer
{
    public static void main(String args[])
    {
        try
        {
            String st=null;
            System.out.println(st.length());
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
            System.out.println("The string contains a null value");
        }
        finally
        {
            System.out.println("The rest of the code");
        }
    }
}