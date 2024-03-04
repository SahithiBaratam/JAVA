public class NestedTry
{
    public static void main(String args[])
    {
        try
        {
            String s=null;
            System.out.println(s.length());
            try
            {
                System.out.println("Divide by zero");
                int a=40/0;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            try
            {
                int a[]=new int[5];
                a[5]=8;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            try
            {
                String st="abc";
                int i=Integer.parseInt(st);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Other Statements");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Normal Flow");
    }
}

