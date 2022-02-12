//2. Write a program in java to create a class Employee having data members name, employee_ID,Salary,Company Name, and member functions
// getdata()--to get Employee information
// display()--to display Employee information.
import java.util.Scanner;
public class Employee {

    String name, c_name;
    int emp_id;
    double salary;

    void getdata() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = SC.nextLine();
        System.out.print("Enter Company's Name: ");
        c_name = SC.nextLine();
        System.out.print("Enter Employee ID: ");
        emp_id = SC.nextInt();
        System.out.print("Enter Employee Salary: ");
        salary= SC.nextDouble();

        SC.close();
    }

    void display() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + c_name);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.getdata();
        e.display();
    }
}
