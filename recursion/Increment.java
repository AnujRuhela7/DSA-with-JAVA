package recursion;

import java.util.Scanner;

public class Increment
{
    Scanner sc = new Scanner(System.in);
    int n,print;
    Increment()
    {
        System.out.println("Print numbers till value");
        n = sc.nextInt();
        print = 1;
    }
    public void increment(int n,int print)
    {
        if (n==1)
            System.out.println(n);
        if (print <= n)
        {
            System.out.println(print);
            print++;
            increment(n,print);
        }
    }

    public static void main(String[] args)
    {
        Increment obj = new Increment();
        obj.increment(obj.n, obj.print);
    }
}
