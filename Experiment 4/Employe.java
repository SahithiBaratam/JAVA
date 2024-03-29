/* wap to take the input of 5 employees and display the details using functions/methods */
import java.util.Scanner;

class Employe_e {
    String name;
     int empId;
     String qualification;

     void input() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = sc.next();

        System.out.print("Enter employee ID: ");
        empId = sc.nextInt();
        

        System.out.print("Enter employee qualification: ");
        qualification = sc.next();
    }

    void show() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Qualification: " + qualification);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        System.out.println("Enter details for 5 employees:");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].input();
        }

        System.out.println("\nEmployee details are :");

        for (Employee employee : employees) {
            System.out.println("\nEmployee Information:");
            employee.show();
        }
    }
}