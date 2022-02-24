/*2. Write a program to find area of Circle, Triangle and Rectangle using constructor overloading concept.*/

import java.util.*;

class Area {
    private int radius, length, breadth, arRectangle;
    private final float pi = 3.14f, half = 0.5f;
    private float base, height, arCircle, arTriangle;

    Area() {
        radius = 0;
        length = 0;
        breadth = 0;
        base = 0;
        height = 0;
    }

    void input(int r) {
        radius = r;
    }

    void input(int l, int b) {
        length = l;
        breadth = b;
    }

    void input(float b, float h) {
        base = b;
        height = h;
    }

    void AreaCircle() {
        arCircle = pi * radius * radius;
        System.out.println("Area of Circle is " + arCircle + "cm.square");
    }

    void AreaTriangle() {
        arTriangle = half * base * height;
        System.out.println("Area of Triangle is " + arTriangle + "cm.square");
    }

    void AreaRectangle() {
        arRectangle = length * breadth;
        System.out.println("Area of Rectangle is " + arRectangle + "cm.square");
    }
}

class Q2 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of Circle as integer");
        int r = sc.nextInt();

        System.out.println("Enter the Length and Breadth of Rectangle as integer");
        int len = sc.nextInt();
        int bre = sc.nextInt();

        System.out.println("Enter the Base and height of Triangle as float");
        float b = sc.nextFloat();
        float h = sc.nextFloat();

        Area circle = new Area();
        Area rectangle = new Area();
        Area triangle = new Area();

        circle.input(r);
        rectangle.input(len, bre);
        triangle.input(b, h);

        circle.AreaCircle();
        rectangle.AreaRectangle();
        triangle.AreaTriangle();
        sc.close();
    }
}