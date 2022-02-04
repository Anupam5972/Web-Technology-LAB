// Write a Program in java to display fibonacci series between 1-100. 4. Write a Program in java to print the following patterns using for loops?
// A)
// *000*000*
// 0*00*00*0
// 00*0*0*00
// 000***000
public class Q4 {
        // ANUPAM MOHARANA, CSE - 05, 20051130
    public static void main(String[] args) {
        int l = 5;
        int i, j;
        for (i = 1; i <= l; i++) {
            for (j = 1; j <= l; j++) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            j--;
            System.out.print("*");
            while (j >= 1) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print("0");
                j--;
            }
            System.out.println("");
        }
    }
}