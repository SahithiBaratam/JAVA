/* Wap to find the compound interest */
import java.util.*;
class Compound
{
  public static void main(String args[])
  {
    double p,r,ci,n;
    System.out.println("Enter the principle amount:");
    Scanner sc = new Scanner(System.in);
    p = sc.nextDouble();
    System.out.println("Enter the rate:");
    r = sc.nextDouble();
    System.out.println("Enter the number of years:");
    n = sc.nextDouble();
    ci = Math.pow(p*(1+r/100),(n)-1);	
    System.out.println("COMPOUND INTEREST:"+ci);
   }
}