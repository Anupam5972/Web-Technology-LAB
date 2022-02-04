// Write a Program in java to display fibonacci series between 1-100.
public class Q3 {
        // ANUPAM MOHARANA, CSE - 05, 20051130
    public static void main(String[] args) {
        int n = 12, fT = 0, sT = 1;
        System.out.println("Fibonacci Series till " + n + "terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.println(fT + ", ");
            int nT = fT + sT;
            fT = sT;
            sT = nT;
        }
    }
}
