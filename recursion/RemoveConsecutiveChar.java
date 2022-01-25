package recursion;

import java.util.Scanner;

public class RemoveConsecutiveChar
{
    String str;
    int index;
    Scanner sc = new Scanner(System.in);
    RemoveConsecutiveChar()
    {
        System.out.print("Enter String : ");
        str = sc.next();
        index = 0;
    }
    public String removeConsecutiveChar(String s)
    {
        char x = s.charAt(index);
        if (s.length() == 1)
        {
           return s;
        }
        if (s.charAt(0) == s.charAt(1))
            return removeConsecutiveChar(s.substring(1));
        else
            return x + removeConsecutiveChar(s.substring(1));
    }

    public static void main(String[] args)
    {
        RemoveConsecutiveChar obj = new RemoveConsecutiveChar();
        System.out.println(obj.removeConsecutiveChar(obj.str));
    }
}