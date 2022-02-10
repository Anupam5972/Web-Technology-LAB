
// void getdata()-to get student information and display()-to display student information. 2. Write a program in java to create a class Employee having data members name, employee_ID,Salary,Company Name, and member functions
// getdata()--to get Employee information
// display()--to display Employee information.
import java.util.Scanner;

public class Q4 {

    String name, c_name;
    int emp_id;
    float HRA, DA, GS, TA, netsalary, salary;

    void getdata() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = SC.nextLine();
        System.out.print("Enter Company's Name: ");
        c_name = SC.nextLine();
        System.out.print("Enter Employee ID: ");
        emp_id = SC.nextInt();
        System.out.print("Enter Employee Salary: ");
        salary = SC.nextFloat();

        SC.close();
    }

    void display() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + c_name);
    }

    void calculate() {
        HRA = (10 / 100) * salary;
        DA = (90 / 100) * salary;
        GS = salary + DA + HRA;
        TA = (3 / 100) * GS;
        netsalary = GS - TA;
        System.out.println("Employee's Net Salary: " + netsalary + "\nEmployee's Gross Salary " + GS);
    }

    public static void main(String[] args) {
        Q4 e = new Q4();
        e.getdata();
        e.display();
        e.calculate();
    }
}
