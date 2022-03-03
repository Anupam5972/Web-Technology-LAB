import java.util.Scanner;

class Shape {
    public double showArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double showArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double showArea() {
        return 3.14 * radius * radius;
    }
}

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Shape[] shape = new Shape[2];
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        shape[0] = new Circle(r);
        System.out.println("Enter Length and Breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        shape[1] = new Rectangle(l, b);
        System.out.println("Area of the Circle: " + shape[0].showArea());
        System.out.println("Area of the Rectangle: " + shape[1].showArea());
        sc.close();
    }
}