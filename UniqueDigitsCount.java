import java.util.HashSet;
import java.util.Scanner;
/*
    Enter a digit, and tell the number of unique digits present in it.
    for e.g.
    Input :
    n = 1015

    Output :
    3
    Here 0, 1 and 5 are the unique digits
*/

public class UniqueDigitsCount
{
    public int uniqueDigitsCount(int input1)
    {
        HashSet<Character> uniqueDigit = new HashSet<>();
        String s = Integer.toString(input1);

        for (int i = 0; i < Integer.toString(input1).length(); i++)
        {
            uniqueDigit.add(s.charAt(i));
        }
        return uniqueDigit.size();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        UniqueDigitsCount obj = new UniqueDigitsCount();
        System.out.print("Enter any number : ");
        System.out.println(obj.uniqueDigitsCount(sc.nextInt()));
    }
}
