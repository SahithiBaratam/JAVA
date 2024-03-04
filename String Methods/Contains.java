public class Contains 
{
    public static void main(String[] args) 
    {
        String s = "The House is situated in Muniguda";
        System.out.println(s.contains("Muniguda")); //true
        System.out.println(s.contains("is situated"));//true
        System.out.println(s.contains(" "));//true
        System.out.println(s.contains("Rayagada"));//false
        System.out.println(s.contains(""));//true

    }
}