import java.lang.*;
import java.util.*;

public class Triangle {
    int a,b,c;
    Triangle(int a,int b,int c){
this.a=a;
this.b=b;
this.c=c;
    }
    void validate(){
        if((a+b)>c && (b+c)>a && (a+c)>b ){
            System.out.println("Triangle is valid");
        }
        else {
            System.out.println("Not valid");
        }
        
    }
    void perimeter(){
        int p;
        p=(this.a+this.b+this.c);
        System.out.println("Perimeter of the triangle  is : "+p);
    }
    void area(){
       double s;
       s = (double)(this.a+this.b+this.c)/2;
        
         double area=(Math.sqrt(s*((s-a)*(s-b)*(s-c))));
        System.out.println("Area of the triangle is: "+area);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Triangle T1=new Triangle(a, b, c);
        T1.validate();
        T1.perimeter();
        T1.area();
        

    }
    
}