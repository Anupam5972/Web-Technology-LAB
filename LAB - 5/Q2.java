// Write a Program in java to check given numbers are palindrome or armstrong? 
public class Q2 {
    // ANUPAM MOHARANA, CSE - 05, 20051130
    public static void main(String[] args) {
        int n = 153, oN, r, rslt = 0, tmp, sum = 0;
        oN = n;
        tmp = n;
        while (oN != 0) {
            r = oN % 10;
            rslt += Math.pow(r, 3);
            oN /= 10;
        }
        if (rslt == n) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is NOT an Armstrong Number");
        }
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (tmp == sum) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("is not a palindrome");
        }
    }
}