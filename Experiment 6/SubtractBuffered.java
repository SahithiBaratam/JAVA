import java.io.*;
public class SubtractBuffered
{
   public static void main(String args[]) throws IOException
   {
      int a,b,c;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the value of a:");
      a = Integer.parseInt(br.readLine());
      System.out.println("Enter the value of b:");
      b = Integer.parseInt(br.readLine());
      c = a - b;
      System.out.println("Subtraction of two numbers is : "+c);
   }
}