import java.util.Scanner;

class Employee {
    static class Inner {
        int id;
        double sal;
        String emp;

        public void getEmpDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name of Employee: ");
            emp = sc.nextLine();

            System.out.println("Enter Employee ID: ");
            id = sc.nextInt();

            System.out.println("Enter Salary: ");
            sal = sc.nextDouble();
            sc.close();
        }

        public void showEmpDetails() {
            System.out.println("Employee name: " + emp);
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Salary: " + sal);
        }
    }
}

public class Q1s{
    public static void main(String[] args) {
        Employee.Inner e1 = new Employee.Inner();
        e1.getEmpDetails();
        e1.showEmpDetails();    
    }
}