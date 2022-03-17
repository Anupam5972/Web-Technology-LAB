
/*2. Create a class which stores Employee name,id and salary Derive two classes from ‘Employee’ class: ‘Regular’ and ‘Part-Time’. The ‘Regular’ class stores DA, HRA
and basic salary. The ‘Part-Time’ class stores the number of hours and pay per hour. Calculate the salary of a regular employee and a par-time employee, using dynamic
method dispatch.*/
import java.util.Scanner;

class Employee {
    int empno;
    String empname;

    void get() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        empname = s.nextLine();
        System.out.println("Enter Employee No.: ");
        empno = s.nextInt();
    }
}

class Regular extends Employee {
    float hra, da, salary, gs;
    int days;
    int empno;
    String empname;

    void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        empname = s.nextLine();
        System.out.println("Enter Employee No.: ");
        empno = s.nextInt();
        System.out.println("Enter Salary: ");
        salary = s.nextInt();
        System.out.println("Enter No. of Days: ");
        days = s.nextInt();
        System.out.println("Enter HRA: ");
        hra = s.nextInt();
        System.out.println("Enter DA: ");
        da = s.nextInt();
    }

    void cal() {
        gs = salary + hra / 100 + da / 100;
        System.out.println("Gross Salary: " + gs);
    }

    void show() {
        System.out.println("Enter Employee No.: " + empno);
        System.out.println("Enter Employee Name: " + empname);
        System.out.println("Enter Salary: " + salary);
        System.out.println("Enter Status: Regular\n");
    }
}

class partTime extends Employee {
    int hourly_rate, working_hours, salary1;
    int empno;
    String empname;

    void getdata1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        empname = s.nextLine();
        System.out.println("Enter Employee No.: ");
        empno = s.nextInt();
        System.out.println("Enter Hourly rate: ");
        hourly_rate = s.nextInt();
        System.out.println("Enter Working hours: ");
        working_hours = s.nextInt();
    }

    void cal1() {
        salary1 = hourly_rate * working_hours;
        System.out.println("Salary: " + salary1);
    }

    void show1() {
        System.out.println("Enter Employee No.: " + empno);
        System.out.println("Enter Employee Name: " + empname);
        System.out.println("Enter Salary: " + salary1);
        System.out.println("Enter Status: Part-Time\n");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Regular e1 = new Regular();
        partTime e2 = new partTime();
        System.out.println("Regular:");
        e1.getdata();
        e1.cal();
        e1.show();
        System.out.println("Part Time:");
        e2.getdata1();
        e2.cal1();
        e2.show1();
    }

}