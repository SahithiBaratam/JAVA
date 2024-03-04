import java.io.Serializable;
import java.io.*;
public class Depersist
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream fin = new FileInputStream("C:\\JAVA\\Stream\\Serial1.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student s1 = (Student)in.readObject();
            System.out.println(s1.id+" "+s1.name);
            in.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}