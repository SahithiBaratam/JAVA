import java.io.*;
class Dimension
{
   Dimension()
   {
      System.out.println("Dimension");
   }
   void print()
   {
      System.out.println("Dimension is executed");
   }
}
class Line extends Dimension
{
   int l;
   Line(int l)
   {
     this.l = l;
   }
   void print1()
   {
      super.print();
      System.out.println("Length is:" +this.l);
   }
}
class Rectangle extends Line
{
   int b;
   Rectangle(int l,int b)
   {
      super(l);
      this.b = b;
   }
   void print2()
   {
       super.print1();
       System.out.println("Breadth is:" +this.b);
   }
}
class Box extends Rectangle
{
  int h;
  Box(int l,int b,int h)
  {
     super(l,b);
     this.h = h;
  }
  void print3()
  {
     super.print2();
     System.out.println("Height is:" +this.h);
  }
  public static void main(String args[])
  {
     Box b = new Box(5,7,8);
     b.print3();
  }
}
      
