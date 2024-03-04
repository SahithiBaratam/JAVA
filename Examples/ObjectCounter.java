public class ObjectCounter 
{
    private static int Count = 0;
    private int i;
    public ObjectCounter(int i) 
    {
        this.i = i;
        Count++;
    }
    public static int getObjectCount() 
    {
        return Count;
    }
    public static void main(String[] args) 
    {
        ObjectCounter obj1 = new ObjectCounter(10);
        ObjectCounter obj2 = new ObjectCounter(20);
        ObjectCounter obj3 = new ObjectCounter(30);
        System.out.println("Total number of objects created: " + ObjectCounter.getObjectCount());
    }
}
