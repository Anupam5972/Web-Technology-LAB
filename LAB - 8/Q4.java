/*
*4. WAP to count number of objects created from a class using concept of constructors and static data members.
*/

public class Q4 {
    static int count = 0;

    Q4() {
        count++;
    }

    public static void main(String[] args) {
        Q4 obj1 = new Q4();
        Q4 obj2 = new Q4();
        Q4 obj3 = new Q4();
        Q4 obj4 = new Q4();
        System.out.println("Number of objects created:" + count);
    }
}