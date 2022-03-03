import java.util.Scanner;
public class Q1l {
    public void getValue() {
        class Local {
            public int id;
            public double sal;
            public String emp;

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
        Local e2 = new Local();
        e2.getEmpDetails();
        e2.showEmpDetails();
    }

    public static void main(String[] args) {
       Q1l outer = new Q1l();
        outer.getValue();
    }
}
