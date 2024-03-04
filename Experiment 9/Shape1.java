abstract class Shape
{
    void shap()
    {
        System.out.println("Drawing a shape");
    }
}
class Rectangle extends Shape
{
    void rect()
    {
        System.out.println("Drawing a Rectangle");
    }
}
class Circle extends Shape
{
    void circ()
    {
        System.out.println("Drawing a circle");
    }
}
public class Shape1 
{
    public static void main(String args[]) 
    {
        Circle obj = new Circle();
        obj.circ();
        obj.shap();
        Rectangle obj1 = new Rectangle();
        obj1.rect();
    }
}