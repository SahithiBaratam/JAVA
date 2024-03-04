class MultithreadDemo extends Thread
{
    public void run()
    {
        System.out.println("Running Thread");
    } 
}
public class ThreadJoin
{
    public static void main(String args[])
    {
        MultithreadDemo t1 = new MultithreadDemo();
        t1.start();
        try
        {
            t1.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}