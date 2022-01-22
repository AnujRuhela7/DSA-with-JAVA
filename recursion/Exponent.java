package recursion;

import java.util.Scanner;

public class Exponent
{
    int base,power;
    Scanner sc = new Scanner(System.in);
    Exponent()
    {
        System.out.print("Base : ");
        base = sc.nextInt();
        System.out.print("Exponent : ");
        power = sc.nextInt();
    }
    public int calculate(int base, int exponent)
    {
        int result = 1;
        if (exponent==0)
        {
            return result;
        }
        else
        {
            return base * (calculate(base,exponent-1));
        }

    }

    public static void main(String[] args)
    {
        Exponent obj = new Exponent();
        System.out.println(obj.calculate(obj.base, obj.power));
    }
}
