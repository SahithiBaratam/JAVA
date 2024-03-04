public class Command
{
    public static void main(String args[]) 
    {
        if (args.length == 0) 
        { 
            System.out.println("No Values");
        } 
        else 
        {
            System.out.print("Command Line Arguments: ");
            for (String arg : args) 
            {
                System.out.print(arg + ",");
            }
            System.out.println("\b");
        }
    }
}
