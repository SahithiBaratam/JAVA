public class ArrayIndex
{
    public static void main(String args[])
    {
        try
        {
            int arr[]={1,2,3,4};
            System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("The length of the array is less than 7");
        }
        finally
        {
            System.out.println("Rest of the code");
        }
    }
}