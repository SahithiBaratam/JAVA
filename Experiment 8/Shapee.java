class Shape
{
   void draw()
   {
      System.out.println("Drawing the shape");
   }
   void CalculateArea()
   {
       System.out.println("Calculating tha area");
   }
}
class Circle extends Shape
{
   double r;
   void draw()
   {
      System.out.println("Drawing the Circle");
   }
   void CalculateArea(double r)
   {
      this.r = r;
      System.out.println("Area of circle is : " +3.14*this.r*this.r);
   }
}
class Square extends Shape
{
   int s;
   void draw()
   {
       System.out.println("Drawing the Square");
   }
   void CalculateArea(int s)
   {
        this.s = s;
        System.out.println("Area of Square is : " +this.s*this.s);
   }
}
class Triangle extends Shape
{
   int b,h;
   void draw()
   {
      System.out.println("Drawing the Triangle");
   }
   void CalculateArea(int b, int h)
   {
      this.b = b;
      this.h = h;
      System.out.println("Area of the Triangle is : " +(b*h)/2);
   }
}
class Shapee
{
   public static void main(String args[])
   {
       Shape d= new Shape();
       d.draw();
       d.CalculateArea();
       Circle c = new Circle();
       c.draw();
       c.CalculateArea(6.45);
       Square s = new Square();
       s.draw();
       s.CalculateArea(5);
       Triangle t = new Triangle();
       t.draw();
       t.CalculateArea(4,8);
   }
}

     
   
 