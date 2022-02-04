//Anupam Moharana 20051130 CSE-05
public class Prime {

    public static void main(String args[]) {
        for (int i = 2; i <= 100;) {
            int p = 1;
            for (int n = 2; n <= i; n++) {
                if ((i % n) == 0 && n != i) {
                    p = 0;
                }
            }
            if (p != 0) {
                System.out.println(i + " is a prime number");
                i++;
            } else {
                i++;
            }
        }
    }
}
