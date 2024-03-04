/* Wap to calculate the area of the rectangle using constructor overloading and method overloading */
import java.util.*;
class Rectangle 
{
    double length;
    double width;
    Rectangle() 
    {
        this.length = 9.0;
        this.width = 7.0;
    }
    Rectangle(double side) 
    {
        this.length = side;
        this.width = side;
    }
    Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    double Area() 
    {
        return length * width;
    }
    double Perimeter()
    {
        return 2 * (length + width);
    }
}
public class Rectanglee
{
    public static void main(String[] args) 
    {
        double length,breadth,side;
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1 - Default Constructor:");
        System.out.println("Area: " + r1.Area());
        System.out.println("Perimeter: " + r1.Perimeter());
        System.out.println();
        System.out.println("Enter the side of the rectangle:");
        side = sc.nextDouble();
        Rectangle r2 = new Rectangle(side);
        System.out.println("Rectangle 2 - One-Argument Constructor:");
        System.out.println("Area: " + r2.Area());
        System.out.println("Perimeter: " + r2.Perimeter());
        System.out.println();
        System.out.println("Enter the length of the rectangle:");
        length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        breadth = sc.nextDouble();
        Rectangle r3 = new Rectangle(length,breadth);
        System.out.println("Rectangle 3 - Two-Arguments Constructor:");
        System.out.println("Area: " + r3.Area());
        System.out.println("Perimeter: " + r3.Perimeter());
    }
}
