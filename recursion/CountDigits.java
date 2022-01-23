package recursion;
import java.util.Scanner;
public class CountDigits
{
    int num,ctr;

    CountDigits()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextInt();
    }

    public int countDigit(int num)
    {
        if(num/10==0)
            return 1;
        return 1 + countDigit(num/10);
    }

    public static void main(String[] args)
    {
        CountDigits obj = new CountDigits();
        System.out.println("Digits in number ( " + obj.num + " ) : " + obj.countDigit(obj.num));
    }
}
