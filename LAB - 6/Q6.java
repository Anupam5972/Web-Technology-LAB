class Q6 {
    static int noOfObjects = 0;
    {
        noOfObjects += 1;
    }
    public Q6() {
    }
    public Q6(int n) {
    }
    public Q6(String s) {
    }
    public static void main(String args[]) {
        Q6 t1 = new Q6();
        Q6 t2 = new Q6(5);
        Q6 t3 = new Q6("GFG");
        System.out.println(Q6.noOfObjects);
    }
}