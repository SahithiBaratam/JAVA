/* Wap to calculate the area of the cone,cylinder using this keyword */
import java.lang.*;
 import java.util.*;
 class Circle {
    int r;
    Circle(int r){
        this.r=r;
    }
    void area(){
        System.out.println("area of circle is: "+(3.14)*(this.r)*(this.r));
    }
    
}
class Cone{
    float r2;
    float l;
    Cone(float r2, float l){
        this.l=l;
        this.r2=r2;

    }
    void area(){
        System.out.println("area of cone is: "+(3.14)*(r2)*(l));
    }
}
class Cylinder{
    double r3;
    double h;
    Cylinder(double r3, double h){
        this.r3=r3;
        this.h=h;
    }
    void area(){
        System.out.println("area of cylinder is: "+(2*r3*3.14*h)+(2*3.14*r3*r3));
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        int r=sc.nextInt();
        Circle c1=new Circle(r);
        c1.area();
         System.out.println("enter radius and length");
        float r2=sc.nextFloat();
        float l=sc.nextFloat();
        Cone c2=new Cone(r,l);
        c2.area();
         System.out.println("enter radius and height");
        double r3=sc.nextDouble();
        double h=sc.nextDouble();
        Cylinder c3=new Cylinder(r3,h);
        c3.area();
        
    }
}