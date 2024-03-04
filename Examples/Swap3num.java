class Swap3num
{
   public static void main(String args[])
   {
      int a=5,b=3,c=2;
      System.out.println("The values before swapping are : ");
      System.out.println("a = " +a);
      System.out.println("b = " +b);
      System.out.println("c = " +c);
      a=a+b+c;
      b=a-(b+c);
      c=a-(b+c);
      a=a-(b+c);
      System.out.println("The values after swapping are : ");
      System.out.println("a = " +a);
      System.out.println("b = " +b);
      System.out.println("c = " +c);
   }
} 