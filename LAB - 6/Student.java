// Write a program in java to create a class Student having data members name, roll_number,branch,Section, University, CGPA and SGPA and member functions
// void getdata()-to get student information and display()-to display student information.
import java.util.Scanner;

public class Student {
    String name, branch, section, university;
    int roll;
    float cgpa, sgpa;

    void getdata() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = SC.nextLine();
        System.out.print("Enter Section: ");
        section = SC.nextLine();
        System.out.print("Enter Branch: ");
        branch = SC.nextLine();
        System.out.print("Enter University: ");
        university = SC.nextLine();
        System.out.print("Enter Roll Number: ");
        roll = SC.nextInt();
        System.out.print("Enter CGPA: ");
        cgpa = SC.nextFloat();
        System.out.print("Enter SGPA: ");
        sgpa = SC.nextFloat();
        SC.close();
    }

    void display() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Roll Number:" + roll);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Section: " + section);
        System.out.println("University: " + university);
        System.out.println("CGPA: " + cgpa);
        System.out.println("SGPA: " + sgpa);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.getdata();
        s.display();
    }
}
