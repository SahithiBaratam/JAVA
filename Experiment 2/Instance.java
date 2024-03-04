/* Wap to calculate arithmetic operations(+,-,*,/,%) using instance variables */
import java.util.*;
class Instance
{
   int a=30,b=40;
   public static void main(String args[])
   {
     int x,y,add,sub,mul,div,mod;
     Instance obj = new Instance();
     System.out.println("INSTANCE VARIABLES");
     System.out.println("Sum = " +(obj.a+obj.b));
     System.out.println("Multiplication = " +(obj.a*obj.b));
     System.out.println("Division = " +(obj.a/obj.b));
     System.out.println("LOCAL VARIABLES");
     System.out.println("Enter the value of x:");
     Scanner sc = new Scanner(System.in);
     x = sc.nextInt();
     System.out.println("Enter the value of y:"); 
     y = sc.nextInt();
     add = x+y;
     sub = x-y;
     mul = x*y;
     div = x/y;
     mod = x%y;
     System.out.println("Addition = " +add);
     System.out.println("Subtraction = " +sub);
     System.out.println("Multiplication = " +mul);
     System.out.println("Division = " +div);
     System.out.println("Modulus = " +mod);
   }
}