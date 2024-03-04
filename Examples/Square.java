import java.util.*;
class Square
{
   double side;
   void Area()
   {
      double area;
      area = this.side*this.side;
      System.out.println("Area of square is:" +area);
   }
   void Perimeter()
   {
      double perimeter;
      perimeter = 4*(this.side);
      System.out.println("Perimeter of the square is:" +perimeter);
   }
}
class Square1
{
   public static void main(String args[])
   {
      int a,p;
      Square squa = new Square();
      System.out.println("Enter the side");
      Scanner sc = new Scanner(System.in);
      squa.side = sc.nextDouble();
      System.out.println("side = "+squa.side);
      squa.Area();
      squa.Perimeter();
   }
}
      
       