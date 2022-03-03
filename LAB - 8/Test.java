import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        base b1 = new base();
        b1.getdata();
        b1.compare();
    }

}

class base {
    int x, y, z;

    public void getdata() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
    }

    public void compare() {
        if (x > y && x > z) {
            System.out.printf("Maximum is 1ST");
        } else if (x > y && x > z) {
            System.out.printf("Maximum is 2ND");
        } else {
            System.out.printf("Maximum is 3RD");
        }
    }
}