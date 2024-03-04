import java.io.*;
public class FileOutput2
{
    public static void main(String[] args) 
    {
        try
        {
            String f = "Demo.txt";
            FileOutputStream fout = new FileOutputStream("C:\\JAVA\\Stream\\Demo.txt");
            System.out.println("Data has been Transferred");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}