/* wap to accept the details of the 5 subject marks of the student and display the grade accordingly  */
import java.util.*;
public class Student
{
    int rollno; 
    String name;
    int marks[] = new int[5];
    void input ()
    {
        int i;
        Scanner sc1 = new Scanner(System.in);
        rollno = sc1.nextInt();
        name = sc1.next();
        System.out.println("Enter 5 subject marks:");
        for(i=0;i<5;i++)
        {
            marks[i] = sc1.nextInt();
        }
    }
    void print()
    {
        System.out.println("Rollnumber: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Grade: "+grade());
    }
    String grade()
    {
       double total = 0,avg;
       for ( int i=0; i<5;i++)
       total+=marks[i];
       avg=total/5;
       if(avg>=60)
          return "First";
       if(avg>=50)
         return "Second";
       if(avg>=40)
         return "third";
       else
         return "Fail";
    }
}
class Student1
{
    public static void main(String[] args) 
    {
       Student s1 = new Student();
       System.out.println("enter your roll number and name");
       s1.input();
       s1.print();
   }
}