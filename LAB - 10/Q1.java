/* Create a class Data with data members: height and breadth of object given by the user and member functions get_data() to read the values and put_data() to display the
values. Create another class Rectangle that inherits class Data and implement its methods areaRectangle () and perimeterRectangle() that computes the area and
perimeter of a rectangle. Create another class Triangle that inherits class Data and implement its methods areaTriangle() and perimeterTriangle() that computes the area
and perimeter of a triangle. */

import java.util.Scanner;

class Data {
    double height, breadth;
    double area, perimeter;

    void get_data() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Height: ");
        height = s.nextDouble();
        System.out.println("Enter Breadth: ");
        breadth = s.nextDouble();
    }

    void put_data() {
        System.out.println("Height: " + height);
        System.out.println("Breadth: " + breadth);
    }
}

class Rectangle extends Data {

    void areaRectangle() {
        super.get_data();
        area = height * breadth;
        System.out.println("Area Rectangle: " + area);
    }

    void perimeterRectangle() {
        perimeter = 2 * (height + breadth);
        System.out.println("Perimeter Rectangle: " + perimeter);
    }
}

class Triangle extends Data {

    void areaTriangle() {
        super.get_data();
        area = 0.5 * height * breadth;
        System.out.println("Area Triangle : " + area);
    }

    void perimeterTriangle() {
        perimeter = (height + breadth + height);
        System.out.println("Perimeter Triangle: " + perimeter);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Data d = new Data();
        d.get_data();
        d.put_data();
        Rectangle d1 = new Rectangle();
        d1.areaRectangle();
        d1.perimeterRectangle();
        Triangle d2 = new Triangle();
        d2.areaTriangle();
        d2.perimeterTriangle();
    }
}