/* Wap to display the details of an employee */
import java.lang.*;
import java.util.*;

class Details
{
    String name;
    int age;
    String gender;
    Details()
    {
        System.out.println("Person's details are");
    }
    Details(String n,int a,String gen)
    {
      name=n;
      age=a;
      gender=gen;
     

    }
    void show()
    {
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Gender is: "+gender);
    }
}
public class Person 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Enter your gender: ");
        String gender=sc.next();
        Details d1=new Details(name, age, gender);
        d1.show();
    }
}