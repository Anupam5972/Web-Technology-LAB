package Test.factorial;

import java.util.Scanner;

public class fact
{
    Scanner sc=new Scanner(System.in);
    int num,f;
    public void get_data()
    {
        System.out.print("Enter number: ");
        num=sc.nextInt();
    }
    public void findFactorial()
    {
        f=1;
        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial = "+f);
    }
}