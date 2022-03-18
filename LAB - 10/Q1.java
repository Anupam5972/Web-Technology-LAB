/* Create a class Data with data members: height and breadth of object given by the user and member functions get_data() to read the values and put_data() to display the
values. Create another class Rectangle that inherits class Data and implement its methods areaRectangle () and perimeterRectangle() that computes the area and
perimeter of a rectangle. Create another class Triangle that inherits class Data and implement its methods areaTriangle() and perimeterTriangle() that computes the area
and perimeter of a triangle. */

import java.util.Scanner;

class Data {
    Scanner sc_1130 = new Scanner(System.in);
    float height_1130, breadth_1130;

    public void get_data() {
        System.out.print("Enter height and breadth: ");
        height_1130 = sc_1130.nextFloat();
        breadth_1130 = sc_1130.nextFloat();
    }

    public void put_data() {
        System.out.println("height = " + height_1130 + "\tbreadth = " + breadth_1130);
    }
}

class Rectangle extends Data {
    float area_1130, p_1130;

    public void areaRectangle() {
        area_1130 = height_1130 * breadth_1130;
        System.out.println("Area of Rectangle = " + area_1130);
    }

    public void perimeterRectangle() {
        p_1130 = 2 * (height_1130 + breadth_1130);
        System.out.println("Perimeter of Rectangle = " + p_1130);
    }
}

class Triangle extends Data {
    float area_1130, p_1130;

    public void areaTriangle() {
        area_1130 = 0.5f * height_1130 * breadth_1130;
        System.out.println("Area of Triangle = " + area_1130);
    }

    public void perimeterTriangle() {
        p_1130 = (float) (breadth_1130
                + 2 * (Math.sqrt(height_1130 * height_1130 + (breadth_1130 * breadth_1130 / 4))));
        System.out.println("Perimeter of Triangle = " + p_1130);
    }
}

public class Q1 {

    public static void main(String[] args) {
        Rectangle obj1_1130 = new Rectangle();
        obj1_1130.get_data();
        obj1_1130.put_data();
        obj1_1130.areaRectangle();
        obj1_1130.perimeterRectangle();
        Triangle obj2_1130 = new Triangle();
        obj2_1130.get_data();
        obj2_1130.put_data();
        obj2_1130.areaTriangle();
        obj2_1130.perimeterTriangle();
    }
}