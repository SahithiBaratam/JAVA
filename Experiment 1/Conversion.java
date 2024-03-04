/* Wap to convert celcius into farenheit and vice versa */
class Conversion
{
   public static void main(String args[])
   {
     int f1=67,f2,c1,c2=93;
     c1=(f1-32/9*5);
     f2=(c2/5 +32*9);
     System.out.println("Conversion of 67 degree farenheit to celcius is : " +c1);
     System.out.println("Conversion of 93 degree celcius to farenheit is : " +f2);
   }
}
      