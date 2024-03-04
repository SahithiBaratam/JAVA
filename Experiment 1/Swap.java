/* To Swap two numbers without using third variable */
class Swap
{
     public static void main(String args[])
    {
         int x=30;
         int y=40;
         System.out.println("The values before swapping are:");
         System.out.println("x= "+x);
         System.out.println("y= "+y);
         x=x+y;
         y=x-y;
         x=x-y;
         System.out.println("The values after swapping are:");
         System.out.println("x= "+x);
         System.out.println("y= "+y);
     }
}
