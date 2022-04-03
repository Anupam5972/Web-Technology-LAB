import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        int n, b;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter any valid Integer: ");
            try {
                b = Integer.parseInt(sc.next());
                System.out.println("You entered: " + b);
            } catch (NumberFormatException e) {
                System.out.println("\nNumberFormatException occurred");
            }
            System.out.println("\nEnter the number of ELements and Elements of the array: ");
            n = sc.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            try {
                for (int i = 0; i <= ar.length; i++)
                    System.out.print(ar[i] + " ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nArrayIndexOutOfBoundsException occurred");
            }
        } catch (Exception e) {
            System.out.println("\nhandled the exception (outer catch)");
        }
        sc.close();
    }
}