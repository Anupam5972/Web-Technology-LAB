/*
 * 3. WAP to add and subtract two Q3s (hrs,mins & secs) using
 * constructors with proper conditions of 24 hour format and display the result.
 */
public class Q3 {

    int secs;
    int mins;
    int hrs;

    public Q3(int hrs, int mins, int secs) {
        this.hrs = hrs;
        this.mins = mins;
        this.secs = secs;
    }

    public static void main(String[] args) {

        Q3 strt = new Q3(8, 12, 15);
        Q3 stp = new Q3(12, 34, 55);
        Q3 d;

        d = difference(strt, stp);

        System.out.printf("Q3 DIFFERENCE: %d:%d:%d - ", strt.hrs, strt.mins, strt.secs);
        System.out.printf("%d:%d:%d ", stp.hrs, stp.mins, stp.secs);
        System.out.printf("= %d:%d:%d\n", d.hrs, d.mins, d.secs);
    }

    public static Q3 difference(Q3 strt, Q3 stp) {
        Q3 d = new Q3(0, 0, 0);

        if (strt.secs > stp.secs) {
            --stp.mins;
            stp.secs += 60;
        }

        d.secs = stp.secs - strt.secs;

        if (strt.mins > stp.mins) {
            --stp.hrs;
            stp.mins += 60;
        }

        d.mins = stp.mins - strt.mins;
        d.hrs = stp.hrs - strt.hrs;

        return (d);
    }
}