import java.util.Scanner;

public class AnyToAny
{
    public static int toDecimal(int sBase, int num)
    {
        int decimal = 0;
        int i = 0;
        while(num > 0)
        {
            int rem = num % 10;
            decimal += rem * Math.pow(sBase,i);
            num = num / 10;
            i++;
        }
//        System.out.println("Decimal : " + decimal);
        return decimal;
    }

    public static int toAnyBase(int sBase, int dBase, int num)
    {
        int result = 0;
        int i = 0;
        if (sBase == 10)
        {
            while(num > 0)
            {
                int rem = num % dBase;
                result += rem * Math.pow(10,i);
                num = num/dBase;
                i++;
            }
//            System.out.println(result);
        }
        else
        {
            int temp = toDecimal(sBase, num);
            while(temp > 0)
            {
                int rem = temp % dBase;
                result += rem * Math.pow(10,i);
                temp = temp/dBase;
                i++;
            }
//            System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int srcBase = sc.nextInt();
        int destBase = sc.nextInt();
        int num = sc.nextInt();
        if (destBase == 10)
        {
            System.out.println(toDecimal(srcBase,num));
        }
        else
        {
            System.out.println(toAnyBase(srcBase,destBase,num));
        }
        /*
        int result = 0;
        int copy = num;
        int i = 0;
        if(srcBase == 10)
        {
            while(num > 0)
            {
                int rem = num % destBase;
                result += rem * Math.pow(10,i);
                num = num/destBase;
                i++;
            }
            System.out.println(result);
        }
        else
        {
            int decimal = 0;
            while(num > 0)
            {
                int rem = num % destBase;
                decimal += rem * Math.pow(srcBase,i);
                num = num / 10;
                i++;
            }
            System.out.println("Decimal : " + decimal);
            i = 0;
            while(decimal > 0)
            {
                int rem = decimal % destBase;
                result += rem * Math.pow(10,i);
                decimal = decimal/destBase;
                i++;
            }

            System.out.println("Final Answer : " + result);
        }
        */
    }
}
