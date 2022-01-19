package array;

import java.util.Scanner;

public class CompareTwoArray
{
    int[] myArray1, myArray2;
    int s1,s2;
    Scanner sc = new Scanner(System.in);
    CompareTwoArray()
    {
        System.out.print("Size of 1st array : ");
        s1 = sc.nextInt();
        System.out.print("Size of 2nd array : ");
        s2 = sc.nextInt();
        myArray1 = new int[s1];
        myArray2 = new int[s2];
    }
    public void setMyArray1()
    {
        System.out.println("1st Array Elements : ");
        for (int i = 0; i < myArray1.length; i++)
        {
            myArray1[i] = sc.nextInt();
        }
    }
    public void setMyArray2()
    {
        System.out.println("2nd Array Elements : ");
        for (int i = 0; i < myArray2.length; i++)
        {
            myArray2[i] = sc.nextInt();
        }
    }
    public void compare(int[] arr1, int[] arr2)
    {
        for (int temp : arr1)
        {
            int ctr = 0;
            for (int i : arr2)
            {
                if (temp <= i)
                    ctr++;
            }
            System.out.print(ctr + ",");
        }
    }
}
class CompareTwoArrayMain
{
    public static void main(String[] args)
    {
        CompareTwoArray obj = new CompareTwoArray();
        obj.setMyArray1();
        obj.setMyArray2();
        obj.compare(obj.myArray1, obj.myArray2);
    }
}
