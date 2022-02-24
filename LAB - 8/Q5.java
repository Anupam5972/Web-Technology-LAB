/*
 * 5. Write a program to perform following operations on an array
 * A. Find the repeated numbers in the array
 * B. Find the pair of numbers in array whose consecutive numbers subtraction is
 * equal to zero.
 * C. Find Transpose of a 3x3 matrix.
 */
class function {
    int arr[];
    boolean findPair(int arr[], int p) {
        int size = arr.length;

        // Initialize positions of two elements
        int i = 0, j = 1;

        // Search for a pair
        while (i < size && j < size) {
            if (i != j && (arr[j] - arr[i] == p || arr[i] - arr[j] == p)) {
                System.out.print("Pair Found: " +
                        "( " + arr[i] + ", " + arr[j] + " )");
                return true;
            } else if (arr[j] - arr[i] < p)
                j++;
            else
                i++;
        }

        System.out.print("No such pair");
        return false;
    }
}

public class Q5 {
    public static void main(String[] args) {
        function f = new function();
        int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
        int original[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int transpose[][] = new int[3][3];
        int p = 0;
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
        f.findPair(arr, p);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        System.out.println("\nPrinting Matrix without transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();// new line
        }
        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}