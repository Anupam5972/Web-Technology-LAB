/*2.WAP in java to handle following exceptions using try catch blocks. A. ArithmeticException
B. NullPointerException
C. ArrayIndexOutOfBoundsException
D. NumberFormatException */

import java.util.Scanner;

public class Q2A {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num1, num2, num;
        try {
            System.out.println("Print Num1 and Num2:");
            num1 = s.nextInt();
            num2 = s.nextInt();
            num = num2 / num1;
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Num can't be divided by Zero!");
        }
        s.close();
    }
}
