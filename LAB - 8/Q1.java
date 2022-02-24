
/* 
*1. Write a program in java to implement a class Employee having data members name, employee_id, salary . 
*Include default, parameterized and copy constructor to initialize data members of the class and also copy an employee information. 
*A member function show() which is used to display all information about an employee. Use InputStreamReader and BufferedReader 
*classes to take input values for the employee.
*/
import java.io.*;
import java.util.Scanner;

class Employee {
    String name;
    int employee_id, salary;
    Scanner sc = new Scanner(System.in);

    void show() {
        System.out.println("Employee ID = " + employee_id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }

    Employee() {
        System.out.print("Enter id: ");
        employee_id = sc.nextInt();
        String g = sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextInt();
    }

    Employee(int id, String nm, int sal) {
        employee_id = id;
        name = nm;
        salary = sal;
    }

    Employee(Employee emp) {
        employee_id = emp.employee_id;
        name = emp.name;
        salary = emp.salary;
    }
}

public class Q1 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int id, sal;
        String nm;
        System.out.println("Employee - 1");
        Employee e1 = new Employee();
        System.out.println("Employee - 2");
        System.out.print("Enter id: ");
        id = Integer.parseInt(br.readLine());
        System.out.print("Enter name: ");
        nm = br.readLine();
        System.out.print("Enter salary: ");
        sal = Integer.parseInt(br.readLine());
        Employee e2 = new Employee(id, nm, sal);
        Employee e3 = new Employee(e1);
        System.out.println("\nEmployee - 1");
        e1.show();
        System.out.println("\nEmployee - 2");
        e2.show();
        System.out.println("\nEmployee - 3");
        e3.show();
    }
}