// Write a program in java to find given number is a spy number or not. A positive integer is called a spy number if the sum and product of its digits are
// equal. In other words, a number whose sum and product of all digits are equal is
// called a spy number. Let's take the number 1124 and check whether the number is a spy or not. First, we
// will split it into digits (1, 1, 2, 4). After that find the sum and product of all the digits. Sum=1+1+2+4=8
// Product=1*1*2*4=8
public class Q6 {
    // ANUPAM MOHARANA, CSE - 05, 20051130
    public static void main(String args[]) {
        int num, product = 1, sum = 0, lastdigit, oN;
        num = 1124;
        oN = num;
        while (num > 0) {
            lastdigit = num % 10;
            sum = sum + lastdigit;
            product = product * lastdigit;
            num = num / 10;
        }
        if (sum == product)
            System.out.println(oN + " is a spy number.");
        else
            System.out.println(oN + " is not a spy number.");
    }
}