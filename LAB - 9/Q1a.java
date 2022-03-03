import java.util.Scanner;

abstract class Employee
{
    Scanner sc=new Scanner(System.in);
    int id;
    String company_name;
    float salary;
    abstract void get_Emp_details();
    abstract void display_Emp_details();
}
class Q1a
{
    public static void main(String[] args)
    {
        Employee obj1=new Employee() {
            void get_Emp_details() {
                System.out.print("Enter Employee's Company Name: ");
                company_name = sc.nextLine();
                System.out.print("Enter Employee ID: ");
                id = sc.nextInt();
                System.out.print("Enter Employee Salary: ");
                salary = sc.nextFloat();
            }
            void display_Emp_details() {
                System.out.println("Employee ID: " + id);
                System.out.println("Employee Salary: " + salary);
                System.out.println("Employee's Company Name: " + company_name);
            }
        };
        obj1.get_Emp_details();
        obj1.display_Emp_details();
    }
}