import java.util.Scanner;

public class StudentMd {
    String name, branch, section, university;
    int roll, mark1, mark2, mark3, mark4, mark5;

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
        System.out.print("Enter Mark of subject 1: ");
        mark1 = SC.nextInt();
        System.out.print("Enter Mark of subject 2: ");
        mark2 = SC.nextInt();
        System.out.print("Enter Mark of subject 3: ");
        mark3 = SC.nextInt();
        System.out.print("Enter Mark of subject 4: ");
        mark4 = SC.nextInt();
        System.out.print("Enter Mark of subject 5: ");
        mark5 = SC.nextInt();

        SC.close();
    }

    void display() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Roll Number:" + roll);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Section: " + section);
        System.out.println("University: " + university);
    }

    void total() {
        System.out.println("Total Marks of the Student is ");
        System.out.println("\n" + (mark1 + mark2 + mark3 + mark4 + mark5) + "\n");
    }

    void avg() {
        System.out.println("Avg Marks of the Student is ");
        System.out.println("\n" + ((mark1 + mark2 + mark3 + mark4 + mark5) / 5) + "\n");
    }

    public static void main(String[] args) {
        StudentMd s = new StudentMd();
        s.getdata();
        s.display();
        s.total();
        s.avg();
    }
}
