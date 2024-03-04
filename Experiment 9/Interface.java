interface Interface1
{
   default void method1()
   {
      System.out.println("Method 1 from Interface");
   }
}
interface Interface2
{
   default void method2()
   {
      System.out.println("Method 2 from Interface");
   }
}
class Myclass implements Interface1,Interface2
{
   public void method1()
   {
      System.out.println("Overridden Method 1 in Myclass");
   }
}
public class Interface
{
   public static void main(String args[])
   {
       Myclass obj = new Myclass();
       obj.method1();
       obj.method2();
   }
}
      




