/* ArrayIndexOutOfBoundsException */

import java.util.Scanner;

public class Q2C {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of ELements and Elements of the array: ");
        n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        try {
            for (int i = 0; i <= ar.length; i++)
                System.out.print(ar[i] + " ");
        } catch (Exception e) {
            System.out.println("\nException caught");
        }
    }
}