
class Details
{
    int rollno;
    String name;
    static String college = "GIET";
    Details(int r,String n)
    {
        rollno = r;
        name = n;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class Staticmethod
{ 
    static
    {
        System.out.println("Static block is executed");
    } 
    public static void main(String args[])
    { 
        Details d1 = new Details(1,"Sahithi");
        Details d2 = new Details(2,"Sravani");
        d1.display();
        d2.display();
     }
}