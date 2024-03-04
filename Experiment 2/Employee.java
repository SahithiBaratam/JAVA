/* Wap to find the provident fund(pf) of an employee */
import java.util.Scanner;
class Employee
{
   public static void main(String args[])
   {
      String name,department;
      int age;
      char gender;
      float basic,pf;
      System.out.println("Enter your name:");
      Scanner sc = new Scanner(System.in);
      name = sc.next();
      System.out.println("Enter your department:");
      department = sc.next();
      System.out.println("Enter your age:");
      age = sc.nextInt();
      System.out.println("Enter your gender:");
      gender = sc.next().charAt(0);
      System.out.println("Enter your basic salary:");
      basic = sc.nextFloat();
      pf = (basic*12)/100;
      System.out.println("NAME: "+name);
      System.out.println("DEPARTMENT: "+department);
      System.out.println("AGE: "+age);
      System.out.println("GENDER: "+gender);
      System.out.println("BASIC SALARY: "+basic);
      System.out.println("PF: "+pf);
    }
}
