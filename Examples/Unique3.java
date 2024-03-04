public class Unique3
{
    public static void main(String[] args) 
    {
        int count = 0;
        System.out.println("Unique three-digit numbers using 1, 2, 3, and 4:");
        for (int i = 1; i <= 4; i++) 
        {
            for (int j = 1; j <= 4; j++) 
            {
                for (int k = 1; k <= 4; k++) 
                {
                    if (i != j && j != k && i != k) 
                    {
                        int number = i * 100 + j * 10 + k;
                        System.out.print(number + " ");
                        count++;
                    }
                }
            }
        }
        System.out.println("\nTotal count of unique three-digit numbers: " + count);
    }
}
