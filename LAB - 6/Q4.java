
// 4. Add the following to Question number-2 by considering your own data members and member functions. 
// a)Find HRA(10%) of basic, DA(90%) of basic, TA(3%) of basic
// b)Find Gross salary by considering basic salary.
import java.util.Scanner;

public class Q4 {

    String name, c_name;
    int emp_id;
    double bs;

    void getdata() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = SC.nextLine();
        System.out.print("Enter Company's Name: ");
        c_name = SC.nextLine();
        System.out.print("Enter Employee ID: ");
        emp_id = SC.nextInt();
        System.out.print("Enter Employee Salary: ");
        bs = SC.nextDouble();

        SC.close();
    }

    void display() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + bs);
        System.out.println("Company Name: " + c_name);
    }

    void calculate() {
        double HRA, DA, GS, TA, ns;
        HRA = 0.1 * bs;
        DA = 0.9 * bs;
        TA = 0.3 * bs;
        GS = bs + DA + HRA;
        ns = GS - TA;
        System.out.println("Employee's Net Salary: " + ns + "\nEmployee's Gross Salary " + GS);
    }

    public static void main(String[] args) {
        Q4 e = new Q4();
        e.getdata();
        e.display();
        e.calculate();
    }
}
