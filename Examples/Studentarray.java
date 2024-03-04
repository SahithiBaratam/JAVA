class Studentarray
{
   int rollno;
   String name;
   char section;
   Studentarray(int r,String n,char s)
   {
      rollno = r;
      name = n;
      section = s;
   }
   public void display()
   {
       System.out.println("Roll Number = " +rollno);
       System.out.println("Name = " +name);
       System.out.println("Section = " +section);
       System.out.println();
   }
}
class Arrayofobj
{
   public static void main(String args[])
   {
       Studentarray[] obj = new Studentarray[5];
       obj[0] = new Studentarray(1,"SAHITHI",'A');
       obj[1] = new Studentarray(2,"SANDEEP",'A');
       obj[2] = new Studentarray(3,"SAI",'B');
       obj[3] = new Studentarray(4,"DEEPIKA",'B');
       obj[4] = new Studentarray(5,"PRASAD",'C');
       System.out.println("STUDENT 1:");
       obj[0].display();
       System.out.println("STUDENT 2:");
       obj[1].display();
       System.out.println("STUDENT 3:");
       obj[2].display();
       System.out.println("STUDENT 4:");
       obj[3].display();
       System.out.println("STUDENT 5:");
       obj[4].display();
    }
}