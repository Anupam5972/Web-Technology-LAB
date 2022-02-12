public class Q6 
{
    static int count=0;
    Q6()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        Q6 obj1 = new Q6();
        Q6 obj2 = new Q6();
        Q6 obj3 = new Q6();
        Q6 obj4 = new Q6();
        System.out.println("Number of objects created:"+count);
    }
}