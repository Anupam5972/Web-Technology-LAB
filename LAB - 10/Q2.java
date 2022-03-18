/*2. Create a class which stores Employee name,id and salary Derive two classes from ‘Employee’ class: ‘Regular’ and ‘Part-Time’. The ‘Regular’ class stores DA, HRA
and basic salary. The ‘Part-Time’ class stores the number of hours and pay per hour. Calculate the salary of a regular employee and a par-time employee, using dynamic
method dispatch.*/

import java.util.Scanner;

class Employee
{
    Scanner sc_1130=new Scanner(System.in);
    String name_1130;
    int id_1130;
    float salary_1130;
    public void get_data()
    {
        System.out.println("Enter name: ");
        name_1130=sc_1130.nextLine();
        System.out.println("Enter id: ");
        id_1130=sc_1130.nextInt();
    }
    public void put_data()
    {
        System.out.println("Name = "+name_1130);
        System.out.println("ID = "+id_1130);
    }
}
class Regular extends Employee
{
    Scanner sc_1130=new Scanner(System.in);
    float da_1130, hra_1130, basic_1130;
    public void get_data()
    {
        System.out.print("Enter name: ");
        name_1130=sc_1130.nextLine();
        System.out.print("Enter id: ");
        id_1130=sc_1130.nextInt();
        System.out.print("Enter basic: ");
        basic_1130=sc_1130.nextFloat();
        da_1130=0.1f*basic_1130;
        hra_1130=0.2f*basic_1130;
        salary_1130=da_1130+hra_1130+basic_1130;
    }
    public void put_data()
    {
        System.out.println("Name = "+name_1130);
        System.out.println("ID = "+id_1130);
        System.out.println("Salary = "+salary_1130);
    }
}
class Parttime extends Employee
{
    int hr_1130; float pph_1130;
    Scanner sc_1130=new Scanner(System.in);
    public void get_data()
    {
        System.out.print("Enter name: ");
        name_1130=sc_1130.nextLine();
        System.out.print("Enter id: ");
        id_1130=sc_1130.nextInt();
        System.out.print("Enter no. of hours and pay per hour: ");
        hr_1130=sc_1130.nextInt();
        pph_1130=sc_1130.nextFloat();
        salary_1130=hr_1130*pph_1130;
    }
    public void put_data()
    {
        System.out.println("Name = "+name_1130);
        System.out.println("ID = "+id_1130);
        System.out.println("Salary = "+salary_1130);
    }
}
public class Q2 {

    public static void main(String[] args) {
        Employee emp1_1130=new Regular();
        Employee emp2_1130=new Parttime();
        emp1_1130.get_data();
        emp2_1130.get_data();
        emp1_1130.put_data();
        emp2_1130.put_data();
    }
}