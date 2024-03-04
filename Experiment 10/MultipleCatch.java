public class MultipleCatch
{
    public static void main(String args[])
    {
        try
        {
            int arr[]={1,2,3,4};
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(arr[4]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}