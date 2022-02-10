import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        int a, b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of a");
            a = sc.nextInt();
            System.out.println("Enter the value of b");
            b = sc.nextInt();
        }
        System.out.println("Sum: " + (a + b));
    }
}