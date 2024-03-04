import java.util.Scanner;
class Student
{
    int rollno;
    int marks[] = new int[3];
    void setMarks(int m1,int m2,int m3) 
    {
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;
    }
    void setRollno(int rollno) 
    {
        this.rollno = rollno;
    }
    int getAvg() 
    {
        int sum = this.marks[0]+this.marks[1]+this.marks[2];
        System.out.println("The Average is: "+ (sum/3));
        // System.out.println("The Percentage is: "+((sum/300)*100));
        return (sum/3);
    }
}

public class Students 
{
    public static void main(String args[]) 
   {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[3];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length;i++) 
        {
            System.out.println("NEW STUDENT");
            s[i] = new Student();
            System.out.println("Enter roll number: ");
            s[i].setRollno(sc.nextInt());
            System.out.println("Enter the three subject marks: ");
            s[i].setMarks(sc.nextInt(),sc.nextInt(),sc.nextInt());
            max = Math.max(max, s[i].getAvg());
            System.out.println("DONE SUCESSFULLY");
        } 
        System.out.println("Maximum average is: "+ max);
    }    

}