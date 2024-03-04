import java.io.*;
public class CopyFile
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            int ch;
            FileInputStream fin = new FileInputStream("C:\\JAVA\\Stream\\Incopy.txt");  
            FileOutputStream fout = new FileOutputStream("C:\\JAVA\\Stream\\Outcopy.txt");
            while((ch=fin.read()) != -1)
            {
                fout.write(ch);
            }
            fin.close();
            fout.close();
            System.out.println("File copied successfully");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}