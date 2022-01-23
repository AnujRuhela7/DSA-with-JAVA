package recursion;

import java.util.Scanner;

public class SumOfArray
{
    int[] arr;
    int size,sum;
    Scanner sc = new Scanner(System.in);
    SumOfArray()
    {
        System.out.println("Size of Array : ");
        size = sc.nextInt();
        arr = new int[size];
    }
    public void getArray()
    {
        System.out.println("Enter elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public int calculateSum(int index)
    {
        if(index <= arr.length-1)
            sum = arr[index] + calculateSum(index+1);
        return sum;
    }

    public static void main(String[] args)
    {
        SumOfArray obj = new SumOfArray();
        obj.getArray();
        System.out.println(obj.calculateSum(0));
    }
}
