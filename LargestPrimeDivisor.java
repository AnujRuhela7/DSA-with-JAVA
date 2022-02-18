import java.util.*;

public class LargestPrimeDivisor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            while(n % i == 0)
            {
                arr.add(i);
                n = n/i;
            }
        }
        if (n==temp)
        {
            System.out.println(-1);
        }
        else if(n > 2)
        {
            arr.add(n);
            System.out.println(arr.get(arr.size()-1));
        }
        else
            System.out.println(arr.get(arr.size()-1));
    }
}