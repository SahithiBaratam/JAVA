import java.util.*;
class Rectangle
{
   double length,width;
   void Area()
   {
      double area;
      area = this.length*this.width;
      System.out.println("Area of rectangle is:" +area);
   }
   void Perimeter()
   {
      double perimeter;
      perimeter = 2*(this.length+this.width);
      System.out.println("Perimeter of the rectan is" +perimeter);
   }
}
class Rectangle1
{
   public static void main(String args[])
   {
      int a,p;
      Rectangle rect = new Rectangle();
      System.out.println("Enter the length");
      Scanner sc = new Scanner(System.in);
      rect.length = sc.nextDouble();
      System.out.println("Enter the breadth");
      rect.width = sc.nextDouble();
      System.out.println("Length = "+rect.length);
      System.out.println("Width = "+rect.width);
      rect.Area();
      rect.Perimeter();
   }
}
      
       