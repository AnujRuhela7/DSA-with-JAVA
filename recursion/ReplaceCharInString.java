package recursion;

import java.util.Scanner;

public class ReplaceCharInString
{
    String str,updatedStr;
    char c1,c2;
    int i = 0;
    public String replaceChar(String initialString, String updatedString, char c1, char c2)
    {
        if (initialString.length() != 0)
        {
            if (initialString.charAt(i) == c1)
            {
                updatedString = updatedString + c2;
                return replaceChar(initialString.substring(i+1), updatedString, c1, c2);
            }
            else
            {
                updatedString = updatedString + initialString.charAt(0);
                return replaceChar(initialString.substring(i+1), updatedString, c1, c2);
            }
        }
        return updatedString;
    }
    public static void main(String[] args)
    {
        ReplaceCharInString obj = new ReplaceCharInString();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        obj.str = sc.nextLine();
        System.out.print("Character to be replaced in string : ");
        obj.c1 = sc.next().charAt(0);
        System.out.print("Replacing character : ");
        obj.c2 = sc.next().charAt(0);
        obj.updatedStr = "";
        System.out.println("Updated String : ");
        System.out.println(obj.replaceChar(obj.str, obj.updatedStr, obj.c1, obj.c2));
    }
}