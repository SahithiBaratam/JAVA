package testpackage;
public class Foundation 
{
    private int var1;       
    int var2;              
    protected int var3;     
    public int var4;        
    public Foundation(int v1, int v2, int v3, int v4) 
    {
        var1 = v1;
        var2 = v2;
        var3 = v3;
        var4 = v4;
    }
}
import testpackage.*;
public class Test3
{
    public static void main(String[] args) 
    {
        testpackage.Foundation foundationObject = new testpackage.Foundation(1, 2, 3, 4);
        System.out.println("var2 (default): " + foundationObject.var2);
        System.out.println("var3 (protected): " + foundationObject.var3);
        System.out.println("var4 (public): " + foundationObject.var4);
    }
}
