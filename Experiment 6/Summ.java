class Summ
{
   public static void main(String args[])
   {
       int sum=0,n;
       for(n=0;n<args.length;n++)
       {
          sum = sum + Integer.parseInt(args[n]);
       }
       System.out.println("Sum of five numbers is : "+sum);
   }
}