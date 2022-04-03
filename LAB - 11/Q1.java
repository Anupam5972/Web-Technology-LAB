
/*Define an interface with three methods – earnings(), deductions() and bonus() and
define a Java class, “Manager” which uses this interface without implementS bonus()
method. Also define another Java class ,”Substaff” which extends from, “Manager”
class and implements bonus() method. Write the complete program to find out
earnings, deduction and bonus of a substaff with basic salary amount entered by the
user as per the following guidelines –
earnings basic + DA (80% of basic) + HRA (15% of basic)
deduction PF 12% of basic
bonus 50% of basic*/

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter  the  basic  salary:-");
        a = s.nextInt();

        Substaff st = new Substaff(a);
        st.calculate();
        st.bonus();
        st.display();
        s.close();
    }
}

interface Money {
    public void earnings();

    public void deductions();

    public void bonus();
}

abstract class Manager implements Money {
    double earning, deduction;

    public void earnings() {
        System.out.println("Manager implements the method earnings.");
    }

    public void deductions() {
        System.out.println("Manager implements the method deductions.");
    }
}

class Substaff extends Manager implements Money {
    double basic_salary, bonus;

    Substaff(int bs) {
        basic_salary = bs;
    }

    public void calculate() {
        earning = basic_salary + (0.8 * basic_salary) + (0.15 * basic_salary);
        deduction = 0.12 * basic_salary;
        bonus = 0.5 * basic_salary;
    }

    public void bonus() {
        System.out.println("Substaff  implementS  the  method  bonus.");
    }

    public void display() {
        System.out.println("Earning  of  the  employee  :  " + earning);
        System.out.println("Deduction  of  the  employee  :  " + deduction);
        System.out.println("Bonus  of  the  employee  :  " + bonus);
    }
}