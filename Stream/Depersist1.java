import java.io.Serializable;
import java.io.*;
public class Depersist1
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream fin = new FileInputStream("C:\\JAVA\\Stream\\Serial2.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student1 s1 = (Student1)in.readObject();
            System.out.println(s1.id+" "+s1.name+" "+s1.age);
            in.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}