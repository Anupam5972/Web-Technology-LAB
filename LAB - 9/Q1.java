import java.util.Scanner;

class Employee {

    private int id;
    private String emp;
    private double sal;

    class inner {
        Scanner sc = new Scanner(System.in);

        public void getEmpDetails() {
            System.out.println("Enter Name of Employee: ");
            emp = sc.nextLine();

            System.out.println("Enter Employee ID: ");
            id = sc.nextInt();

            System.out.println("Enter Salary: ");
            sal = sc.nextDouble();
        }

        public void showEmpDetails() {
            System.out.println("Employee name: " + emp);
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Salary: " + sal);
        }
    }

    void get_Inner() {
        inner inner = new inner();
        inner.getEmpDetails();
    }

    void display_Inner() {
        inner inner = new inner();
        inner.showEmpDetails();
    }



}

public class Q1 {

    public static void main(String[] args) {
        Employee.inner e = new Employee().new inner();
        e.getEmpDetails();
        e.showEmpDetails();


    }
}