public class IllegalArgument 
{
   int m;
   public void setMarks(int marks) 
   {
      if(marks < 0 || marks > 100)
         throw new IllegalArgumentException(Integer.toString(marks));
      else
         m = marks;
   }
   public static void main(String[] args) 
   {
      IllegalArgument s1 = new IllegalArgument();
      s1.setMarks(45);
      System.out.println(s1.m);
      IllegalArgument s2 = new IllegalArgument();
      s2.setMarks(101);
      System.out.println(s2.m);
   }
}
