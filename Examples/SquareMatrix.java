import java.util.*;
public class SquareMatrix
{
    public static void main(String[] args)
    {
        int i,j,sum=0;
        int [][] arr = new int[3][3];
        System.out.println("Enter the elements of the matrix 3X3:");
        Scanner sc = new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
               sum=sum +arr[i][j]; 
            }
            System.out.println("Sum of row " + i + " is equal to: " +sum);
        }
    }
}