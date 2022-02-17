// 2. Write a program in java to perform following operations using function overloading concept. 
// A. Volume Of Sphere
// B. Volume Of Prism
// C. Volume Of Cylinder
// D. Volume Of Cone
// E. Volume Of Cuboid
import java.util.Scanner;

class Volume {
    double vol, a, b, c;

    void findVolume(double a) {
        System.out.println("Volume of Sphere = " + (1.33 * 3.14 * a * a * a));
    }

    void findVolume(double a, double b, double c) {
        System.out.println("Volume of rectangular box = " + (a * b * c));
    }

    void findVolume(double a, double b) {
        System.out.println("Volume of Prism = " + (a * b));
        System.out.println("Volume of cylinder = " + (3.14 * a * a * b));
        System.out.println("Volume of Cone = " + (0.33 * 3.14 * a * a * b));
    }
}

class Q2 {
    public static void main(String args[]) {
        double a, b, c;
        Scanner s = new Scanner(System.in);
        Volume obj = new Volume();

        System.out.print("Enter the radius of Sphere : ");
        a = s.nextDouble();
        obj.findVolume(a);

        System.out.print("Enter the length, width and height of the Cuboid : ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        obj.findVolume(a, b, c);

        System.out.print("Enter the Parameters For \n1.The Prism \n2.The Cylinder \n3.The Cone:\n");
        a = s.nextDouble();
        b = s.nextDouble();
        obj.findVolume(a, b);
        s.close();
    }
}