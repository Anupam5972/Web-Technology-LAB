import java.util.Scanner;

class Cost {
    public double Cost_Cal() {
        return 0;
    }
}

class Two_D extends Cost {
    private double width;
    private double height;

    public Two_D(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Cost_Cal() {
        double area = width * height;
        return 40 * area;
    }
}

class Three_D extends Cost {
    private double length;
    private double width;
    private double height;

    public Three_D(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double Cost_Cal() {
        double volume = length * height * width;
        return 60 * volume;
    }
}

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Cost[] shape = new Cost[2];
        System.out.println("Enter Length, Breadth, Width: ");
        double a = sc.nextDouble();
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        shape[0] = new Three_D(a, h, w);
        System.out.println("Enter Length and Breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        shape[1] = new Two_D(l, b);
        System.out.println("Cost of the Three_D: " + shape[0].Cost_Cal());
        System.out.println("Cost of the Two_D: " + shape[1].Cost_Cal());
        sc.close();
    }
}