// 3. Write a program in java to create a class Distance having feet and inches as data members and perform following operations. 
// A. Add two distances
// B. Subtract two distances

import java.util.Scanner;

class Distance {
    int feet;
    int inches;

    public void getDistance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feet: ");
        feet = sc.nextInt();
        System.out.print("Enter inches: ");
        inches = sc.nextInt();
    }

    public void showDistance() {
        System.out.println("Feet: " + feet + " Inches: " + inches);
    }

    public void addDistance(Distance D1, Distance D2) {
        inches = D1.inches + D2.inches;
        feet = D1.feet + D2.feet + (inches / 12);
        inches = inches % 12;
    }

    public void subDistance(Distance D1, Distance D2) {
        inches = D1.inches - D2.inches;
        feet = D1.feet - D2.feet - (inches / 12);
        inches = inches % 12;
    }
}

public class Q3 {
    public static void main(String[] s) {
        Distance D1 = new Distance();
        Distance D2 = new Distance();
        Distance D3 = new Distance();

        System.out.println("Enter first distance: ");
        D1.getDistance();
        System.out.println("Enter second distance: ");
        D2.getDistance();

        D3.addDistance(D1, D2);
        System.out.println("Total distance is:");
        D3.showDistance();

        D3.subDistance(D1, D2);
        System.out.println("Total Difference is:");
        D3.showDistance();
    }
}