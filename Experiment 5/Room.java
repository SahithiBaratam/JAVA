/* Wap to calculate the area of the wall and room using constructor */
import java.lang.*;
import java.util.*;
class Details
{
    int length;
    int breadth;
    int height;
    int windows;
    int Fans;
    int doors;
    Details(int l,int b,int h,int fan,int d,int win)
    {
        length=l;
        breadth=b;
        height=h;
        Fans=fan;
        doors=d;
        windows=win;
    }
    void show()
    {
        System.out.println("Length is: "+length);
        System.out.println("Breadth is: "+breadth);
        System.out.println("Height is: "+height);
        System.out.println("Number of fans: "+Fans);
        System.out.println("Doors: "+doors);
        System.out.println("Number of windows: "+windows);
    }
    void area()
    {
        System.out.println("Floor area is: "+length*breadth);
        int wall_area=2*(length*height+breadth*height);
        System.out.println("Wall area is: "+wall_area);
        System.out.println("Total area: "+(0.2)*(wall_area));
    }
}
public class Room
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the length:");
       int length=sc.nextInt();
       System.out.println("Enter the breadth:");
       int breadth=sc.nextInt();
       System.out.println("Enter the height:");
       int height=sc.nextInt();
       System.out.println("Enter the number of fans:");
       int Fans=sc.nextInt();
       System.out.println("Enter the number of doors:");
       int doors=sc.nextInt();
       System.out.println("Enter the number of windows:");
       int windows=sc.nextInt();
       Details d1=new Details(length, breadth,  height, Fans, doors,windows);
       d1.show();
       d1.area();
    }
}